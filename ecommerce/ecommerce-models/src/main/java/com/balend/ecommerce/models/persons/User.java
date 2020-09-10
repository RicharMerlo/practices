package com.balend.ecommerce.models.persons;

/**
 *
 * @author Ricardo Martínez Merlo <ic.ricardo.merlo@gmail.com>
 */
public class User {

         private int rid;
         private String name;
         private String lastName;
         private int age;
         private String email;
         private String telephone;

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

         public String getLastName() {
                  return lastName;
         }

         public void setLastName(String lastName) {
                  this.lastName = lastName;
         }

         public int getAge() {
                  return age;
         }

         public void setAge(int age) {
                  this.age = age;
         }

         public String getEmail() {
                  return email;
         }

         public void setEmail(String email) {
                  this.email = email;
         }

         public String getTelephone() {
                  return telephone;
         }

         public void setTelephone(String telephone) {
                  this.telephone = telephone;
         }

}
