package com.balend.ecommerce.utils.configuration;

import java.util.ResourceBundle;

/**
 *
 * @author Ricardo Martínez Merlo <ic.ricardo.merlo@gmail.com>
 */
public class Configuration {
    
    private final ResourceBundle properties;

    public Configuration() {
        properties = ResourceBundle.getBundle("com.balend.ecommerce.properties.Configuration");
    }
    
    public String getMysqlUrl(){
        return properties.getString("ecommerce.connection.string.url");
    }
    
    public String getMysqlUser(){
        return properties.getString("ecommerce.connection.string.user");
    }
    
    public String getMysqlPass(){
        return properties.getString("ecommerce.connection.string.password");
    }
    
}
