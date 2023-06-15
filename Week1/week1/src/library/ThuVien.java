package library;


import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thanh
 */
class ThuVien {

     public int[] createArray(int size_Array){
        int [] array = new int[size_Array];
        Random rd = new Random();
        for (int i = 0; i < size_Array; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }
      public void display(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (i<array.length-1) {
                            System.out.print(array[i]+ ", ");

            }else{
                System.out.println(array[i]);
            }
        }
    }
      
      
}
