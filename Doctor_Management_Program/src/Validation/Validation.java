package Validation;
import java.util.Scanner;

public class Validation {
    private final Scanner getDataNext = new Scanner(System.in);
    private static Validation instance = null;
    //Singleton Pattern
    public static Validation getInstance() {
        if (instance == null) instance = new Validation();
        return instance;
    }
   
    //method GetString from Validation instance
     public String validationInputString(String massenger) {
        Scanner getDataText = new Scanner(System.in);
        String text = null;
        //Loop until operator <> null or operator.length != 0
        while (text == null || text.length() == 0) {
            System.out.print("Please,  enter your input ( " + massenger + " ) : ");
            text = getDataText.nextLine();
        }
        return text;
    }
     
     //Method GetInt from Validation instance
     public int validationInputInt(String massenger, String warning, int min, int max) {
           System.out.print("Enter your input ( " + massenger + " ) : ");
           //Loop until the value was entered being a Interger number
            while (true) {
                try {
                    int number = Integer.parseInt(this.getDataNext.nextLine());
                    if (min <= number && number <= max) return number;
                } 
                catch (NumberFormatException e) {
                    //Check if the number enter is valid (it must be Integer) 
                    System.err.println("Your input is invalid" + "(" + warning + ")" );
                }
                System.out.print("Please, enter again your input "
                        + "( " + massenger + " )  " + min + "  <= Value <= " + max + " : ");
             }
    }
}
