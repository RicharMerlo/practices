package com.balend.ecommerce.models.articles;

import java.math.BigDecimal;

/**
 *
 * @author Ricardo Martínez Merlo <ic.ricardo.merlo@gmail.com>
 */
public class Item {

         private int rid;
         private String name;
         private String description;
         private BigDecimal price;
         private int quantity;

         public int getRid() {
                  return rid;
         }

         public void setRid(int rid) {
                  this.rid = rid;
         }

         public String getName() {
                  return name;
         }

         public void setName(String name) {
                  this.name = name;
         }

         public String getDescription() {
                  return description;
         }

         public void setDescription(String description) {
                  this.description = description;
         }

         public BigDecimal getPrice() {
                  return price;
         }

         public void setPrice(BigDecimal price) {
                  this.price = price;
         }

         public int getQuantity() {
                  return quantity;
         }

         public void setQuantity(int quantity) {
                  this.quantity = quantity;
         }

         @Override
         public String toString() {
                  return "Item{" + "rid=" + rid + ", name=" + name + ", description=" + description + ", price=" + price + ", quantity=" + quantity + '}';
         }
         
}
