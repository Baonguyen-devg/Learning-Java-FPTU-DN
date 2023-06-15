/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.util.ArrayList;
import model.Contact;
import view.Validation;

/**
 *
 * @author Thanh
 */
public class Thuvien {
    Validation val = new Validation();
    String format = "%-3s %-15s %-12s %-12s %-6s %-20s %s%n";
     public  int generateID(ArrayList<Contact> list_c){
        int id = 0;
        if (list_c.isEmpty()) {
            return 1;
        } else {
            for (Contact fruit : list_c) {
                if (fruit.getId()== list_c.size()-1) {
                    id = fruit.getId();
                }
            }
        }
        return id;
    }
      public void createContact(ArrayList<Contact> lc){
          int id = generateID(lc);
          String firstName = val.inputString("Enter first name: ");
          String lastName = val.getString("Enter last name");
          String group = val.getString("Enter group: ");
          String address = val.getString("Enter Address: ");
          String phone = val.inputPhone();
          lc.add(new Contact(id, firstName+" "+lastName,group, address, phone, firstName, lastName));
          System.err.println("Add successfully");
          
      }
      
      
      
      public void displayContact(ArrayList<Contact> lc){
          System.out.println("--------------------------------- Display all Contact ----------------------------");
          if (lc.isEmpty()) {
              System.out.println("No contact");
          }else{
               System.out.printf(format, "ID", "Name",
                "First Name", "Last Name", "Group", "Address", "Phone");
          }
          
          for (Contact c : lc) {
              
             System.out.printf(format, c.getId(), c.getFullName(), c.getFirstName(),
                  c.getLastName(), c.getGroup(), c.getAddress(), c.getPhone());

          }
      }
      public Contact getContactById(ArrayList<Contact> lc, int idDel){
          for (Contact c : lc) {
              if (c.getId()==idDel) {
                  return c;
              }
          }
          return null;
      }
      
      public void deleteContact(ArrayList<Contact> lc){
          int idDel = val.getInt("Enter id to delete contact",0,1000);
          Contact c = getContactById(lc, idDel);
          if(c==null){
              System.err.println("not found contact");
          }
          else {
              lc.remove(c);
          }
                        System.err.println("delete successfully");

      }
}
