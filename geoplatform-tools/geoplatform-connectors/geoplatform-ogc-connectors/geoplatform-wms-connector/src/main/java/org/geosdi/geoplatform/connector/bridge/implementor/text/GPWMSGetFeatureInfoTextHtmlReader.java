package org.geosdi.geoplatform.connector.bridge.implementor.text;

import org.geosdi.geoplatform.connector.server.request.WMSFeatureInfoFormat;

import static java.lang.Boolean.TRUE;
import static org.geosdi.geoplatform.connector.server.request.WMSFeatureInfoFormat.TEXT_HTML;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public class GPWMSGetFeatureInfoTextHtmlReader extends GPWMSGetFeatureInfoTextReader {

    /**
     * @return {@link WMSFeatureInfoFormat}
     */
    @Override
    public WMSFeatureInfoFormat getKey() {
        return TEXT_HTML;
    }

    /**
     * @return {@link Boolean}
     */
    @Override
    public Boolean isValid() {
        return TRUE;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}