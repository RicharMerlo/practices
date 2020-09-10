package com.balend.ecommerce.sql;

/**
 *
 * @author Ricardo Martínez Merlo <ic.ricardo.merlo@gmail.com>
 */
public class ConnectionException extends Exception {

         public ConnectionException() {
         }

         public ConnectionException(String message) {
                  super(message);
         }

         public ConnectionException(String message, Throwable cause) {
                  super(message, cause);
         }

         public ConnectionException(Throwable cause) {
                  super(cause);
         }

}
