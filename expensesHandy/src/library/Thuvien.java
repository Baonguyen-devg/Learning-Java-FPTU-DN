/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import Model.Expenses;
import java.util.ArrayList;
import view.Validation;

/**
 *
 * @author Thanh
 */
public class Thuvien {
    Validation val = new Validation();
     public  void addExpense(ArrayList<Expenses> le, int id) {
        String date = val.checkInputDate("Enter Date: ");
        double amount = val.checkInputDouble("Enter Amount: ");
        
        String content = val.getString("Enter Content: ");
        le.add(new Expenses(id, date, amount, content));
    }

    public  void displayExpense(ArrayList<Expenses> le) {
        if (le.isEmpty()) {
            System.err.println("List Expenses empty");
            return;
        }
        double total = 0;
        System.out.printf("%-7s%-20s%-20s%-20s\n", "ID", "Date", "Amount of money", "Content");
        for (int i = 0; i < le.size(); i++) {
            System.out.printf("%-7d%-20s%-20.0f%-20s\n", le.get(i).getId(), le.get(i).getDate(),
                    le.get(i).getAmount(), le.get(i).getContent());
            total += le.get(i).getAmount();
        }
        System.out.printf("Total: %-20.0f\n", total);
    }

    public  int checkIdExist(ArrayList<Expenses> le, int id) {
        for (int i = 0; i < le.size(); i++) {
            if (le.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public  void deleteExpense(ArrayList<Expenses> le) {
        int id = val.checkInputInt("Enter id: ");
        int checkIdExist = checkIdExist(le, id);
        if (checkIdExist != -1) {
            le.remove(checkIdExist);
            System.out.println("Delete an expense successful");
            for (int i = id - 1; i < le.size(); i++) {
                le.get(i).setId(le.get(i).getId() - 1);
            }
        } else {
            System.err.println("Delete an expense fail");
        }
    }
}
