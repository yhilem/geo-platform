package org.geosdi.geoplatform.websocket.support.spring.configuration.broker.mem;

import lombok.ToString;
import net.jcip.annotations.Immutable;
import org.geosdi.geoplatform.configurator.bootstrap.Develop;
import org.geosdi.geoplatform.websocket.support.spring.configuration.broker.GPWebSocketStompBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.stream.Stream.of;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
@ToString
@Immutable
@Develop
@Component(value = "geoPlatformWebSocketMemBroker")
class GPWebSocketMemBroker implements GPWebSocketStompBroker {

    private static final long serialVersionUID = 8307355635679759238L;
    //
    private static final String ENDPOINTS_VALUE = "geoPlatformWebSocketServerConfigurator{gp.websocket.stomp.endpoints:@null}";
    private static final String DESTINATION_APPLICATION_PREFIX_VALUE = "geoPlatformWebSocketServerConfigurator{gp.websocket.stomp.application.prefix:@null}";
    private static final String STOMP_BROKERS_VALUE = "geoPlatformWebSocketServerConfigurator{gp.websocket.stomp.brokers:@null}";
    //
    @Value(ENDPOINTS_VALUE)
    private String endpoints;
    @Value(DESTINATION_APPLICATION_PREFIX_VALUE)
    private String destinationApplicationPrefix;
    @Value(STOMP_BROKERS_VALUE)
    private String stompBrokers;

    /**
     * @return {@link String[]}
     */
    @Override
    public String[] getEndpoints() {
        return of(this.endpoints.split(","))
                .filter(Objects::nonNull)
                .filter(value -> !value.trim().isEmpty())
                .map(value -> (value.startsWith("/") ? value : "/".concat(value)))
                .toArray(String[]::new);
    }

    /**
     * @return {@link String[]}
     */
    @Override
    public String[] getDestinationApplicationPrefix() {
        return of(this.destinationApplicationPrefix.split(","))
                .filter(Objects::nonNull)
                .filter(value -> !value.trim().isEmpty())
                .map(value -> (value.startsWith("/") ? value : "/".concat(value)))
                .toArray(String[]::new);
    }

    /**
     * @return {@link String[]}
     */
    @Override
    public String[] getStompBrokers() {
        return of(this.stompBrokers.split(","))
                .filter(Objects::nonNull)
                .filter(value -> !value.trim().isEmpty())
                .map(value -> (value.startsWith("/") ? value : "/".concat(value)))
                .toArray(size -> new String[size]);
    }

    /**
     * Invoked by the containing {@code BeanFactory} after it has set all bean properties
     * and satisfied {@link org.springframework.beans.factory.BeanFactoryAware}, {@code ApplicationContextAware} etc.
     * <p>This method allows the bean instance to perform validation of its overall
     * configuration and final initialization when all bean properties have been set.
     *
     * @throws Exception in the event of misconfiguration (such as failure to set an
     *                   essential property) or if initialization fails for any other reason
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        checkArgument((this.endpoints != null) && !(this.endpoints.trim().isEmpty()) && !(this.endpoints.equals(ENDPOINTS_VALUE)), "Parameter Endpoints can not be Null or an Empty String or " + ENDPOINTS_VALUE);
        checkArgument((this.destinationApplicationPrefix != null) && !(this.destinationApplicationPrefix.trim().isEmpty()) && !(this.destinationApplicationPrefix.equals(DESTINATION_APPLICATION_PREFIX_VALUE)), "Parameter DestinationPrefix can not be Null or an Empty String or " + DESTINATION_APPLICATION_PREFIX_VALUE);
        checkArgument((this.stompBrokers != null) && !(this.stompBrokers.trim().isEmpty()) && !(this.stompBrokers.equals(STOMP_BROKERS_VALUE)), "Parameter StompBrokers can not be Null or an Empty String or " + STOMP_BROKERS_VALUE);
    }
}