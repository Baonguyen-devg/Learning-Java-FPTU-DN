package controller;

import Model.Student;
import java.util.ArrayList;
import view.Menu;
import view.Validation;

import java.util.List;
import java.util.Scanner;
import library.Thuvien;

//Display all Customer s, Customer Search, Add new Customer, Customer statistical
public class StudentManagement extends Menu {
    ArrayList<Student> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    static String[] menu = {"Display student",
        "Quit"
    };

    public StudentManagement() {
        super("Customer Management System", menu);
    }
    Thuvien tv= new Thuvien();
    @Override
    public void execute(int choice) {
        switch (choice) {

            case 1:
                tv.addStudent(list);
                tv.display(list);
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
        StudentManagement cm = new StudentManagement();
        cm.run();
    }

}
