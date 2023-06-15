package controller;

import java.util.ArrayList;
import library.Thuvien;
import model.Contact;
import view.Menu;

public class ContactManagement extends Menu {

    Thuvien tv = new Thuvien();
    
             ArrayList<Contact> lc = new ArrayList<>();


    static String[] menu = {"Add a Contact",
        "Display all Contact",
        "Delete a Contact",
        "Exit"
    };

    public ContactManagement()  {
        super("======== Contact program ========", menu);
       
       

    }

    @Override
    public void execute(int choice) {
        switch (choice) {

            case 1:

              tv.createContact(lc);

                break;

            case 2:

              tv.displayContact(lc);

                break;

            case 3:
             tv.deleteContact(lc);
                break;

            case 4:
                System.out.println("Exit successfully");
                System.exit(0);

            default:
        }
    }

    // function 
   
}
