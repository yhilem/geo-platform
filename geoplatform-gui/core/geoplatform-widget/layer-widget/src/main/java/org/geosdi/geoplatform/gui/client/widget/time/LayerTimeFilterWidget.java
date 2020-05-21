/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2019 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 *   This program is free software: you can redistribute it and/or modify it
 *   under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version. This program is distributed in the
 *   hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *   even the implied warranty of MERCHANTABILITY or FITNESS FOR
 *   A PARTICULAR PURPOSE. See the GNU General Public License
 *   for more details. You should have received a copy of the GNU General
 *   Public License along with this program. If not, see http://www.gnu.org/licenses/
 *
 *   ====================================================================
 *
 *   Linking this library statically or dynamically with other modules is
 *   making a combined work based on this library. Thus, the terms and
 *   conditions of the GNU General Public License cover the whole combination.
 *
 *   As a special exception, the copyright holders of this library give you permission
 *   to link this library with independent modules to produce an executable, regardless
 *   of the license terms of these independent modules, and to copy and distribute
 *   the resulting executable under terms of your choice, provided that you also meet,
 *   for each linked independent module, the terms and conditions of the license of
 *   that module. An independent module is a module which is not derived from or
 *   based on this library. If you modify this library, you may extend this exception
 *   to your version of the library, but you are not obligated to do so. If you do not
 *   wish to do so, delete this exception statement from your version.
 */
package org.geosdi.geoplatform.gui.client.widget.time;

import com.extjs.gxt.ui.client.widget.layout.FormLayout;
import org.geosdi.geoplatform.gui.client.config.LayerModuleInjector;
import org.geosdi.geoplatform.gui.client.i18n.LayerModuleConstants;
import org.geosdi.geoplatform.gui.client.model.RasterTreeNode;
import org.geosdi.geoplatform.gui.client.puregwt.binding.event.GPBeanTreeMoldeBindingEvent;
import org.geosdi.geoplatform.gui.client.puregwt.filter.IGPFilterWidgetHandler;
import org.geosdi.geoplatform.gui.client.widget.GeoPlatformWindow;
import org.geosdi.geoplatform.gui.client.widget.time.panel.TimeDimensionPanel;
import org.geosdi.geoplatform.gui.client.widget.time.panel.TimeFilterPanel;
import org.geosdi.geoplatform.gui.client.widget.tree.GPTreePanel;
import org.geosdi.geoplatform.gui.model.tree.GPBeanTreeModel;
import org.geosdi.geoplatform.gui.puregwt.properties.WidgetPropertiesHandlerManager;

import static java.lang.Boolean.TRUE;

/**
 * @author Nazzareno Sileno - CNR IMAA geoSDI Group
 * @email nazzareno.sileno@geosdi.org
 */
public class LayerTimeFilterWidget extends GeoPlatformWindow implements IGPFilterWidgetHandler {

    public final static String LAYER_TIME_DELIMITER = " - [";
    public final static short WIDGET_HEIGHT = 300;
    public final static short WIDGET_WIDTH = 400;
    //
    private GPTreePanel<GPBeanTreeModel> treePanel;

    /**
     * @param lazy
     * @param treePanel
     */
    public LayerTimeFilterWidget(boolean lazy, GPTreePanel<GPBeanTreeModel> treePanel) {
        super(lazy);
        super.setResizable(Boolean.FALSE);
        this.treePanel = treePanel;
        WidgetPropertiesHandlerManager.addHandler(IGPFilterWidgetHandler.TYPE, this);
    }

    @Override
    public void addComponent() {
        GPBeanTreeModel itemSelected = this.treePanel.getSelectionModel().getSelectedItem();
        super.add(
                ((RasterTreeNode) itemSelected).getExtent().isTemporal() ?
                        new TimeDimensionPanel(LayerModuleInjector.MainInjector.getInstance().getTimeDimensionFormPanel()) :
                        new TimeFilterPanel(this.treePanel));
        WidgetPropertiesHandlerManager.fireEvent(new GPBeanTreeMoldeBindingEvent(itemSelected));
    }

    @Override
    public void initSize() {
        super.setWidth(WIDGET_WIDTH);
        super.setAutoHeight(TRUE);
    }

    @Override
    public void setWindowProperties() {
        super.setHeadingHtml(LayerModuleConstants.INSTANCE.LayerTimeFilterWidget_timeFilderHeadingText());
//        super.setLayout(new FormLayout());
        super.setModal(Boolean.TRUE);
    }
}
