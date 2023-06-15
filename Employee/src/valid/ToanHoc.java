package valid;

import java.util.Scanner;
public class ToanHoc {
    public static double anyNumberDouble(String name){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the " + name + " number:");
        double number = sc.nextDouble();
        return number;
    }
    
    
    public static double numberDoubleGreater0(String name){
        Scanner sc = new Scanner(System.in);
        double number = 0;
        while(number <= 0){
            System.out.println("Please enter the " + name + " number(" + name + "> 0):");
            number = sc.nextDouble();
        }
        return number;
    }
    
    public static double numberDoubleGe0(String name){
        Scanner sc = new Scanner(System.in);
        double number = -1;
        while(number < 0){
            System.out.println("Please enter the " + name + " number(" + name + ">= 0):");
            number = sc.nextDouble();
        }
        return number;
    }
    
    public static double inputRate(String name){
        Scanner sc = new Scanner(System.in);
        double number = 0;
        while(number <= 0 || number > 100){
            System.out.println("Please enter the " + name + " number(" + name +">0% && " + name + " <= 100%):");
            number = sc.nextDouble();
        }
        return number; 
    }
    
    public static int anyNumberInt(String name){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the " + name + " number:");
        int number = sc.nextInt();
        return number;
    }
    
    public static int numberOther0Int(String name){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while(number == 0){
            System.out.println("Please enter the " + name + " number(" + name + " != 0):");
            number = sc.nextInt();
        }
        return number;
    }
    
    public static int numberGeZeroInt(String name){
        Scanner sc = new Scanner(System.in);
        int number = -1;
        while(number < 0){
            System.out.println("Please enter the " + name + " number(" + name+ ">= 0)");
            number = sc.nextInt();
        }
        return number;
    }
    public static int numberGreater0Int(String name){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while(number <= 0){
            System.out.println("Please enter the " + name + " number(" + name+ ">0)");
            number = sc.nextInt();
        }
        return number;
    }
    public static int validYearInput(){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while(number < 1900){
            System.out.println("Please enter year(>=1900): ");
            number = sc.nextInt();
        }
        return number;
    }
    
    public static int validMonthOrDay(String name, int min , int max){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while(number < min || number > max){
            System.out.println("Please Enter " + name + " :");
            number = sc.nextInt();
        }
        return number;
    }
    
    public static boolean inputLogic(String name){
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter " + name);
       boolean lg = sc.nextBoolean();
       return lg;
    }
}
