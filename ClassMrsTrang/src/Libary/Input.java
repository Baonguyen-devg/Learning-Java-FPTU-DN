package Libary;
import java.util.Scanner;

public class Input {
    public static Scanner enterValue = new Scanner(System.in);
    public static int IntInput(String Massenge) {
        System.out.println(Massenge);
        return enterValue.nextInt();
    }
    
    public static double DoubleInput(String Massenge) {
        System.out.println(Massenge);
        return enterValue.nextDouble();
    }
    
    public static float FloatInput(String Massenge) {
        System.out.println(Massenge);
        return enterValue.nextFloat();
    }
    
    public static String StringInput(String Massenge) {
        System.out.println(Massenge);
        return enterValue.next();
    }
}
