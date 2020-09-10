package com.balend.eccomerce.web.controllers;

import com.balend.ecommerce.models.articles.Item;
import com.balend.ecommerce.sql.ConnectionException;
import com.balend.ecommerce.sql.ConnectionProvider;
import com.balend.ecommerce.sql.JNDIConecctionProvider;
import com.balend.ecommerce.sql.dao.ItemDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo Martínez Merlo <ic.ricardo.merlo@gmail.com>
 */
public class ItemController {

         public List<Item> getAllItems() {
                  List<Item> items = new ArrayList<>();
                  try {
                           ConnectionProvider provider = new JNDIConecctionProvider();
                           ItemDao dao = new ItemDao(provider);
                           items = dao.getItems();
                  } catch (ConnectionException ex) {
                  }
                  return items;
         }

}
