package com.balend.ecommerce.utils.configuration;

import java.util.ResourceBundle;

/**
 *
 * @author Ricardo Martínez Merlo <ic.ricardo.merlo@gmail.com>
 */
public class MySqlConfig {
    
    private final ResourceBundle properties;

    public MySqlConfig() {
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
