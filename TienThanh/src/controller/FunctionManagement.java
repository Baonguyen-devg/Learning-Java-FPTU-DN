/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import java.util.Scanner;
import library.Algorithm;
import view.Menu;

/**
 *
 * @author Thanh
 */
public class FunctionManagement extends Menu {
    
    Algorithm al = new Algorithm();
    static String[] menu = {
            "Letter and character count",
            
            "Change base number system(16, 10, 2)",
            
            "Quit"
    };
    
    public FunctionManagement() {
        super("Function Management System", menu);
    }
     @Override
    public void execute(int choice) {
        switch (choice) {

            case 1:
                al.countWordAndLetter();
                break;
            case 2:
                al.runConvert();
                break;
            
            case 3:
                System.out.println("Exit successfully");
                System.exit(0);
//                break;
            default:
                return;
        }
        
    }
    
    
  
}
