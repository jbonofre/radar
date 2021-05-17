package net.nanthrax.test;

import com.netflix.radar.RadarAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;

@Plugin(name = "Radar", category = "Core", elementType = "appender", printObject = true)
public class RadarWrapper extends RadarAppender {

    public RadarWrapper() {
        super();
    }

    @PluginFactory
    public static RadarAppender createAppender() {
        return new RadarAppender();
    }

}
