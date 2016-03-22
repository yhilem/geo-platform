/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.geosdi.geoplatform.experimental.openam.support.config.placeholder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.net.MalformedURLException;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
@Configuration
class OpenAMConnectorPlaceholderConfig {

    private static final Logger logger = LoggerFactory.getLogger(OpenAMConnectorPlaceholderConfig.class);

    private static final OpenAMConnectorResourcesLoader openAMConnectorResourcesLoader = new OpenAMConnectorResourcesLoader();

    @Bean(name = "openAMConnectorConfigurator")
    @Required
    public static PropertySourcesPlaceholderConfigurer openAMConnectorPropertyConfigurer(
            @Value("#{systemProperties['OPENAM_CONNECTOR_DATA_DIR']}") String openAMConnectorConfigDataDir,
            @Value("#{systemProperties['OPENAM_CONNECTOR_FILE_PROP']}") String openAMConnectorFileProp)
            throws MalformedURLException {

        logger.debug("::::::::::::::::::::::::::::::::::::: INITIALIZING OPENAM_CONNECTOR PLACEHOLDER\n");

        PropertySourcesPlaceholderConfigurer openAMConnectorPC = new PropertySourcesPlaceholderConfigurer();
        openAMConnectorPC.setPlaceholderPrefix("openAMConnectorConfigurator{");
        openAMConnectorPC.setPlaceholderSuffix("}");
        openAMConnectorPC.setNullValue("@null");

        openAMConnectorPC.setLocations(openAMConnectorResourcesLoader.loadResources(
                openAMConnectorConfigDataDir,
                openAMConnectorFileProp));
        openAMConnectorPC.setIgnoreResourceNotFound(Boolean.TRUE);
        openAMConnectorPC.setIgnoreUnresolvablePlaceholders(Boolean.TRUE);

        return openAMConnectorPC;
    }
}
