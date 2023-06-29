package controller;


import view.Menu;
import view.Validation;

import java.util.List;
import java.util.Scanner;

//Display all Customer s, Customer Search, Add new Customer, Customer statistical
public class TemplateManagement extends Menu {
   Validation val = new  Validation();
    static String[] menu = {"Run",
           
            "Quit"
    };
    

    public TemplateManagement() {
        super("Validate Progaram", menu);
    }

    @Override
    public void execute(int choice) {
        switch (choice) {

            case 1:
               val.checkPhone("Phone number : ");
               val.checkEmail("Email: ");
               val.checkDate("Date: ");
                break;
            case 2:
               
                break;
            case 3:
               
                break;
            case 4:
               
                break;
            case 5:
               
                break;


            case 6:
                System.out.println("Exit successfully");
                System.exit(0);
//                break;
            default:
                return;
        }
    }



    public static void main(String[] args) {
        TemplateManagement cm = new TemplateManagement();
        cm.run();
    }

}
