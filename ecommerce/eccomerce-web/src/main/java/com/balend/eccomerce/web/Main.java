package com.balend.eccomerce.web;

import com.balend.eccomerce.web.controllers.ItemController;
import com.balend.ecommerce.models.articles.Item;
import java.util.List;

/**
 *
 * @author Ricardo Martínez Merlo <ic.ricardo.merlo@gmail.com>
 */
public class Main {

         public static void main(String[] args) {
                  
                  
                  ItemController controller = new ItemController();
                  
                  
                  
                  List<Item> items = controller.getAllItems();
                  System.out.println("Items:");
                  for (Item item : items) {
                           System.out.println("item = " + item.toString());
                  }
         }

}
