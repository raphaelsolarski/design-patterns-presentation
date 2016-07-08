package singleton;

import java.util.Map;

public class Configurator {
    private static Configurator configurator = new Configurator();
    private Map<String, String> configuration;

    private Configurator() {
        //load configuration from xml/db/csv
    }

    public static Configurator getConfigurator() {
        return configurator;
    }

    public String getParameter(String key) {
        return configuration.get(key);
    }

}
