package com.balend.ecommerce.sql;

import java.sql.Connection;

/**
 *
 * @author Ricardo Martínez Merlo <ic.ricardo.merlo@gmail.com>
 */
public interface ConnectionProvider {
    
    Connection openConnection()  throws ConnectionException;
    
}
