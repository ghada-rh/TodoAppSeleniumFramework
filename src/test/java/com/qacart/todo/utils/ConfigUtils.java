package com.qacart.todo.utils;

import java.util.Properties;

public class ConfigUtils {
    Properties properties;
    static ConfigUtils configUtils;

    public ConfigUtils(){
        properties = PropertiesUtils.loadProperties("src/test/java/com/qacart/todo/config/production.propreties");
    }

    public static ConfigUtils getInstance(){
        if(configUtils == null){
            configUtils = new ConfigUtils();
        }
        return configUtils;
    }
    public String getBaseUrl(){
        return properties.getProperty("baseUrl");
    }
    public String getEmail(){
        return properties.getProperty("email");
    }
    public String getPassword(){
        return properties.getProperty("password");
    }
}
