/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import Model.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import view.Validation;

/**
 *
 * @author Thanh
 */
public class Thuvien {

    Validation val = new Validation();

    public void display(ArrayList<Student> list) {
        list.sort((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println("-------------Student " + (i+1) + "-------------");
            System.out.println("Name:" + list.get(i).getName());
            System.out.println("Classes:" + list.get(i).getClasses());

            System.out.println("Mark:" + list.get(i).getMark());

        }
    }

    public void addStudent(ArrayList<Student> list) {
        boolean choice = true;
        do {
            String name = val.getString("Name: ");
            String classes = val.getString("Clases: ");
            int mark = val.getInt("MarK: ", 0, 100);
            list.add(new Student(name, classes, mark));
            choice = val.getYN("Do you want to enter more student information?(Y/N):");
        } while (choice);
    }
}
