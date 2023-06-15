package Validate;

import java.util.Scanner;

public class Validate {

    public static double validateInputDouble(String name) {
        Scanner sc = new Scanner(System.in);
        double number = 0;
        while (number < 0) {
            System.out.println("Enter " + name + " > 0 ");
            number = sc.nextDouble();
        }
        return number;
    }

    public static double validateInputDouble(String name, double min) {
        Scanner sc = new Scanner(System.in);
        double number = 0;
        while (number > min) {
            System.out.println("Enter " + name + " > " + min + " : ");
            number = sc.nextDouble();
        }
        return number;
    }

    public static double validateInputDouble(String name, double min, double max) {
        Scanner sc = new Scanner(System.in);
        double number = 0;
        while (number < min || number > max) {
            System.out.println("Enter " + name + " > " + min + " < " + max + " : ");
            number = sc.nextDouble();
        }
        return number;
    }

    public static int validateInputInt(String name) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (number < 0) {
            System.out.println("Enter " + name + " > 0 ");
            number = sc.nextInt();
        }
        return number;
    }

    public static int validateInputInt(String name, int min) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (number > min) {
            System.out.println("Enter " + name + " > " + min + " : ");
            number = sc.nextInt();
        }
        return number;
    }

    public static int validateInputInt(String name, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (number < min || number > max) {
            System.out.println("Enter " + name + " > " + min + " < " + max + " : ");
            number = sc.nextInt();
        }
        return number;
    }

    public static String validateInputString(String name) {
        Scanner sc = new Scanner(System.in);
        String string = null;
        while (string == null || string.length() == 0) {
            System.out.println("Enter " + name + " <> null: ");
            string = sc.nextLine();
        }
        return string;
    }
    
}
