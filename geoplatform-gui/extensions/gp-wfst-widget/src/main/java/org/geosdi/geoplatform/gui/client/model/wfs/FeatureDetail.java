/**
 * geo-platform
 * Rich webgis framework
 * http://geo-platform.org
 * ====================================================================
 * <p>
 * Copyright (C) 2008-2018 geoSDI Group (CNR IMAA - Potenza - ITALY).
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
package org.geosdi.geoplatform.gui.client.model.wfs;

import org.geosdi.geoplatform.connector.wfs.response.FeatureDTO;
import org.geosdi.geoplatform.gui.configuration.map.client.GPCoordinateReferenceSystem;
import org.gwtopenmaps.openlayers.client.Projection;
import org.gwtopenmaps.openlayers.client.feature.VectorFeature;
import org.gwtopenmaps.openlayers.client.geometry.Geometry;

import java.util.Map;

/**
 * @author Vincenzo Monteverde <vincenzo.monteverde@geosdi.org>
 * @author Giuseppe La Scaleia <giuseppe.lascaleia@geosdi.org>
 */
public class FeatureDetail extends FeatureAttributeValuesDetail {

    private static final long serialVersionUID = -1833485422856624704L;

    private VectorFeature vectorFeature;
    private String geometry;
    private String featureID;

    public FeatureDetail(Map<String, String> attributes, FeatureDTO featureDTO) {
        super(attributes);
        this.geometry = featureDTO.getGeometry();
        this.featureID = featureDTO.getFID();
    }

    public FeatureDetail(VectorFeature theFeature, Map<String, String> theAttributes) {
        super(theAttributes);
        this.vectorFeature = theFeature;
        this.featureID = this.vectorFeature.getFID();
    }

    public VectorFeature getVectorFeature() {
        return vectorFeature = ((this.vectorFeature != null) ? this.vectorFeature : this.buildFeature());
    }

    @Override
    protected final VectorFeature buildFeature() {
        assert ((this.geometry != null) && !(this.geometry.isEmpty()));
        assert ((this.featureID != null) && !(this.featureID.isEmpty()));

        Geometry theGeom = Geometry.fromWKT(this.geometry);
        theGeom.transform(new Projection(GPCoordinateReferenceSystem.WGS_84.getCode()),
                new Projection(GPCoordinateReferenceSystem.GOOGLE_MERCATOR.getCode()));
        VectorFeature vectorFeature = new VectorFeature(theGeom);
        vectorFeature.setFID(this.featureID);
        return vectorFeature;
    }

    /**
     * @return the Feature ID
     */
    public String getFeatureID() {
        return featureID;
    }
}
