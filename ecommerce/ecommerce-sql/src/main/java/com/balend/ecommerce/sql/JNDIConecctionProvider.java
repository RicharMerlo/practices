package com.balend.ecommerce.sql;

import com.balend.ecommerce.utils.configuration.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo Martínez Merlo <ic.ricardo.merlo@gmail.com>
 */
public class JNDIConecctionProvider implements ConnectionProvider {

         @Override
         public Connection openConnection() throws ConnectionException {
                  try {
                           Class.forName("com.mysql.cj.jdbc.Driver");
                           Configuration configuration = new Configuration();
                           return DriverManager.getConnection(configuration.getMysqlUrl(), configuration.getMysqlUser(), configuration.getMysqlPass());
                  } catch (SQLException |  ClassNotFoundException ex) {
                           Logger.getLogger(JNDIConecctionProvider.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
                           throw new ConnectionException("No fue posible establecer una conexión a la base de datos");
                  }
         }

}
