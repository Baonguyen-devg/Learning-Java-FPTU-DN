package controller;

import Model.Expenses;
import java.util.ArrayList;
import library.Thuvien;
import view.Menu;

//Display all Customer s, Customer Search, Add new Customer, Customer statistical
public class ExpensesManagement extends Menu {

    ArrayList<Expenses> le = new ArrayList<>();
    int id = 0;
    static String[] menu = {"Add an expense",
        "Display all expenses",
        "Delete an expense",
        "Quit"
    };

    public ExpensesManagement() {
        super("Expenses Management System", menu);
    }
    Thuvien tv = new Thuvien();

    @Override
    public void execute(int choice) {

        switch (choice) {

            case 1:
                tv.addExpense(le, ++id);
                break;
            case 2:
                tv.displayExpense(le);
                break;
            case 3:
                tv.deleteExpense(le);
                id--;
                break;

            case 4:
                System.out.println("Exit successfully");
                System.exit(0);
//                break;
            default:
                return;
        }
    }

    public static void main(String[] args) {
        ExpensesManagement cm = new ExpensesManagement();
        cm.run();
    }

}
