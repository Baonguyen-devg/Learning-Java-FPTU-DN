/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

import Model.Rectangle;

import Validation.Validation;
import static java.lang.Integer.max;

public class Exercise_Rectangle {
    private static final int maxInt = 0x3c3c3c3c;
    
    //in ra cac gia tri bang x trong doi tuong mang arr
    public static void findElementsX(MyArrayList<Rectangle> arr, Rectangle x) {
        for (int i = 0; i < arr.size(); i++) 
            if (x.equals(arr.get(i))) 
                System.out.println(i + " ");
    }
    
       public static void sort(MyArrayList<Rectangle> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).calculateFerence() > arr.get(j).calculateFerence()) {
                    Rectangle tmp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tmp);
                }
            }
        }
    }

    public static void input(MyArrayList<Rectangle> arr) {
        int number = Validation.getInstance().validationInputInt
        ("Enter the number of Array", "Error", 0, maxInt);
        for (int i = 0; i < number; i++) {
            int length = Validation.getInstance().validationInputInt("length", "Error", 0, maxInt);
            int height = Validation.getInstance().validationInputInt("height", "Error", 0, maxInt);
            arr.Add(new Rectangle(length, height));
        }
    }

    public static void main(String[] args) {
        MyArrayList<Rectangle> arr = new MyArrayList<>();
        input(arr);
    }
}
