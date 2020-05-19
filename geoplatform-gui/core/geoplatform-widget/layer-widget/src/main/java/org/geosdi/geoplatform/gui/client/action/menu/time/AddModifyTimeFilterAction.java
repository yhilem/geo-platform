/**
 * geo-platform
 * Rich webgis framework
 * http://geo-platform.org
 * ====================================================================
 * <p>
 * Copyright (C) 2008-2020 geoSDI Group (CNR IMAA - Potenza - ITALY).
 * <p>
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details. You should have received a copy of the GNU General
 * Public License along with this program. If not, see http://www.gnu.org/licenses/
 * <p>
 * ====================================================================
 * <p>
 * Linking this library statically or dynamically with other modules is
 * making a combined work based on this library. Thus, the terms and
 * conditions of the GNU General Public License cover the whole combination.
 * <p>
 * As a special exception, the copyright holders of this library give you permission
 * to link this library with independent modules to produce an executable, regardless
 * of the license terms of these independent modules, and to copy and distribute
 * the resulting executable under terms of your choice, provided that you also meet,
 * for each linked independent module, the terms and conditions of the license of
 * that module. An independent module is a module which is not derived from or
 * based on this library. If you modify this library, you may extend this exception
 * to your version of the library, but you are not obligated to do so. If you do not
 * wish to do so, delete this exception statement from your version.
 */
package org.geosdi.geoplatform.gui.client.action.menu.time;

import com.extjs.gxt.ui.client.event.MenuEvent;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import org.geosdi.geoplatform.gui.action.menu.MenuBaseAction;
import org.geosdi.geoplatform.gui.client.LayerResources;
import org.geosdi.geoplatform.gui.client.command.datasource.CheckDataSourceRequest;
import org.geosdi.geoplatform.gui.client.command.datasource.CheckDataSourceResponse;
import org.geosdi.geoplatform.gui.client.i18n.BasicWidgetModuleMessages;
import org.geosdi.geoplatform.gui.client.model.FolderTreeNode;
import org.geosdi.geoplatform.gui.client.widget.time.LayerTimeFilterWidget;
import org.geosdi.geoplatform.gui.client.widget.tree.GPTreePanel;
import org.geosdi.geoplatform.gui.command.api.ClientCommandDispatcher;
import org.geosdi.geoplatform.gui.command.api.GPClientCommand;
import org.geosdi.geoplatform.gui.configuration.message.GeoPlatformMessage;
import org.geosdi.geoplatform.gui.model.tree.GPBeanTreeModel;
import org.geosdi.geoplatform.gui.model.tree.GPLayerTreeModel;

import static java.lang.Boolean.TRUE;

/**
 * @author Nazzareno Sileno - CNR IMAA geoSDI Group
 * @email nazzareno.sileno@geosdi.org
 */
public class AddModifyTimeFilterAction extends MenuBaseAction {

    private GPTreePanel<GPBeanTreeModel> treePanel;
    private LayerTimeFilterWidget timeFilterWidget;
    private final CheckDataSourceRequest checkDataSourceRequest = GWT.<CheckDataSourceRequest>create(CheckDataSourceRequest.class);

    /**
     * @param treePanel
     */
    public AddModifyTimeFilterAction(GPTreePanel<GPBeanTreeModel> treePanel) {
        super("AddModifyCQLFilter", AbstractImagePrototype.create(LayerResources.ICONS.cqlFilter()));
        this.treePanel = treePanel;
        this.timeFilterWidget = new LayerTimeFilterWidget(TRUE, treePanel);
    }

    @Override
    public void componentSelected(MenuEvent ce) {
        final Menu parentMenu = ce.getMenu().getParentItem().getParentMenu();
        GPBeanTreeModel itemSelected = this.treePanel.getSelectionModel().getSelectedItem();
        if (itemSelected instanceof FolderTreeNode) {
            throw new IllegalArgumentException("The TIME Filter can't be applied to a folder");
        }

        this.checkDataSourceRequest.setDatasource(((GPLayerTreeModel) itemSelected).getDataSource());
        ClientCommandDispatcher.getInstance().execute(new GPClientCommand<CheckDataSourceResponse>() {
            {
                super.setCommandRequest(checkDataSourceRequest);
            }

            @Override
            public void onCommandSuccess(final CheckDataSourceResponse response) {
                if (response.getResult()) {
                    timeFilterWidget.setPagePosition(parentMenu.getPosition(true).x, parentMenu.getPosition(true).y);
                    timeFilterWidget.show();
                } else {
                    GeoPlatformMessage.errorMessage(BasicWidgetModuleMessages.INSTANCE.errorDataSource(),
                            BasicWidgetModuleMessages.INSTANCE.datasourceNotMatches());
                }
            }

            @Override
            public void onCommandFailure(Throwable exception) {
                GeoPlatformMessage
                        .errorMessage(BasicWidgetModuleMessages.INSTANCE.errorDataSource(), exception.getMessage());
            }
        });


    }
}
