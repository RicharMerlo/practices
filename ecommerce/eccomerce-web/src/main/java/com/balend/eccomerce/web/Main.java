package com.balend.eccomerce.web;

import com.balend.eccomerce.web.controllers.ItemController;
import com.balend.ecommerce.models.articles.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Ricardo Martínez Merlo <ic.ricardo.merlo@gmail.com>
 */
public class Main { //Cliente o vista

         public static void main(String[] args) {
                  ItemController controller = new ItemController(); //controlador que ayuda al cliente a usar la logica de negocio
                  Item newItem = new Item();
                  newItem.setName("Pachorritas");
                  newItem.setPrice(new BigDecimal("1000"));
                  newItem.setQuantity(1);
                  controller.agregaItem(newItem);

                  List<Item> items = controller.getAllItems();
                  for (Item item : items) {
                           System.out.println(item.toString());
                  }
         }

}
