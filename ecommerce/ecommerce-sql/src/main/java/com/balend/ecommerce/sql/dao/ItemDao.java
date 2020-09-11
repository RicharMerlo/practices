package com.balend.ecommerce.sql.dao;

import com.balend.ecommerce.models.articles.Item;
import com.balend.ecommerce.sql.ConnectionException;
import com.balend.ecommerce.sql.ConnectionProvider;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo Martínez Merlo <ic.ricardo.merlo@gmail.com>
 */
public class ItemDao {

         private final ConnectionProvider provider;

         public ItemDao(ConnectionProvider provider) {
                  this.provider = provider;
         }

         public List<Item> getItems() throws ConnectionException {
                  String query = "SELECT rid, name, description, price, quantity  FROM item";
                  try (Connection conn = provider.openConnection()) {
                           PreparedStatement statement = conn.prepareStatement(query);
                           List<Item> items = new ArrayList<>();
                           try (ResultSet rs = statement.executeQuery()) {
                                    while (rs.next()) {
                                             Item item = new Item();
                                             item.setRid(rs.getInt("rid"));
                                             item.setName(rs.getString("name"));
                                             item.setDescription(rs.getString("description"));
                                             item.setPrice(new BigDecimal(rs.getString("price")));
                                             item.setQuantity(rs.getInt("quantity"));
                                             items.add(item);
                                    }
                                    return items;
                           }
                  } catch (SQLException ex) {
                           throw new ConnectionException(ex.getMessage());
                  }
         }

         public void insertItem(Item item)  throws ConnectionException {
                   String query = "INSERT INTO item (name, description, price, quantity ) VALUES (?,?,?,?)";
                  try (Connection conn = provider.openConnection()) {
                           PreparedStatement statement = conn.prepareStatement(query);
                           int index = 1;
                           statement.setString(index++, item.getName());
                           statement.setString(index++, item.getDescription());
                           statement.setDouble(index++, item.getPrice().doubleValue());
                           statement.setInt(index++, item.getQuantity());
                           statement.executeUpdate();
                  } catch (SQLException ex) {
                           throw new ConnectionException(ex.getMessage());
                  }
         }

}
