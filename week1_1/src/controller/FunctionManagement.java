/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


//import java.util.List;
//import java.util.Scanner;
import library.Algorithm;
import library.ThuVien;
import view.Menu;
import view.Validation;

/**
 *
 * @author Thanh
 */
public class FunctionManagement extends Menu {
//    Scanner input = new Scanner(System.in);
    Validation val = new Validation();
    ThuVien tv = new ThuVien();
    Algorithm al = new Algorithm();
    static String[] menu = {"Sort",
            "Search",
            
            "Quit"
    };
    
    public FunctionManagement() {
        super("Function Management System", menu);
    }
     @Override
    public void execute(int choice) {
        switch (choice) {

            case 1:
                sortMenu();
                break;
            case 2:
                searchMenu();
                break;
          
            case 3:
                System.out.println("Exit successfully");
                System.exit(0);
//                break;
            default:
        }
        
    }
    
     public void runBubbleSort(){
         //1. enter a positive number
        int size_array = val.getInt("Enter number of array: ");
        //2. create array by generate random in range
        int[] array = tv.createArray(size_array);
        //3. Display first sort
        System.out.println("Display unsorted array");
        tv.display(array);
        //4. sort by bubble sort
        al.bubbleSort(array);
        //5. Display sorted array
                System.out.println("Display sorted array");
                tv.display(array);
    }
    
    public void runQuickSort(){
         //1. enter a positive number
        int size_array = val.getInt("Enter number of array: ");
        //2. create array by generate random in range
        int[] array = tv.createArray(size_array);
        //3. Display first sort
        System.out.println("Display unsorted array");
        tv.display(array);
        //4. sort by quick sort
        al.quickSort(array,0,size_array-1);
        //5. Display sorted array
                System.out.println("Display sorted array");
                tv.display(array);
    }
    public void runBinarySearch(){
           //1. enter a positive number
        int size_array = val.getInt("Enter number of array: ");
        //2. create array by generate random in range
        int[] array = tv.createArray(size_array);
        //3. Display first sort
        System.out.println("Display unsorted array");
        tv.display(array);
        //4. sort by bubble sort
        al.bubbleSort(array);
        //5. Display sorted array
                System.out.println("Display sorted array");
                tv.display(array);
        //6. search by binary search
        int value = val.getInt("Enter a positive number to search: ");
        System.out.println("found " + value + " at index: " + al.binSearch(array, value, 0, size_array-1) );
     }
    
    private void sortMenu() {

        String[] mSort = {"Bubble sort",
                "Quick sort",
                "Back"};
        Menu m1 = new Menu("Student Sorting", mSort) {
            @Override
            public void execute(int n) {
                
                switch (n) {
                    case 1:
                        runBubbleSort();
                        break;
                    case 2:

                        runQuickSort();
                        break;

                    default:
                        System.out.println("Returning to main menu...");
                }

            }
        };
        m1.run();

    }
    private void searchMenu() {

        String[] mSort = {"Linear search",
                "Binary search",
                "Back"};
        Menu m1 = new Menu("Student Sorting", mSort) {
            @Override
            public void execute(int n) {
                
                switch (n) {
                    case 1:
                        al.linearSearch();
                        break;
                    case 2:

                        runBinarySearch();
                        break;

                    default:
                        System.out.println("Returning to main menu...");
                }

            }
        };
        m1.run();

    }
    
    
  
}
