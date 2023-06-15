/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Part1;
import java.util.Scanner;

public class JavaApplication9 {
    public static void main(String[] args) {
     float num1,num2;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number 1");
        num1 = sc.nextFloat();
        System.out.println("Input the number 2");
        num2 = sc.nextFloat();
        System.out.println("Input the operator(+-*/): ");
        num2 = sc.nextFloat();
        sc = new Scanner(System.in);
        op = sc.next();
        if(op.equals("+")){
            System.out.println("the result of "+num1+ op + num2 + "="+ (num1 + num2));
        }
        else{
            if(op.equals("-")){
            System.out.println("the result  "+num1+ op + num2 + "="+ (num1 - num2));
            }
            else{
                if(op.equals("*")){
                System.out.println("the result  "+num1+ op + num2 + "="+ (num1 * num2));
                }
                else{
                    if(op.equals("/")){
                    System.out.println("the result  "+num1+ op + num2 + "="+ (num1 / num2));
                    }
                }
            }
    }
}
}