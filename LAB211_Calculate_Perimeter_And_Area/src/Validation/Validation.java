package Validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {

    private static Validation instance;
    private final Scanner getDataNext = new Scanner(System.in);
    private final Pattern operatorRegexPattern = Pattern.compile("[-+*/=^]");
    
    private Validation() { }
    public static Validation getInstance() { //Singleton Pattern 
        if (instance == null) instance = new Validation();
        return instance;
    }

    public double validationInputDouble(String massenger, String warning, double min) {
        System.out.print("Enter your input ( " + massenger + " ) : ");
 
            while (true) {
                try {
                    double number = Double.parseDouble(this.getDataNext.nextLine());
                    if (min <= number) return number;
                } 
                catch (NumberFormatException e) {
                    System.err.println("Your input is invalid" + "(" + warning + ")" );
                }
                System.out.print("Please,  enter again your input " + massenger + "  >= " + min + " : ");
             }
    }

    public double validationInputDouble(String massenger, String warning, double min, double max) {
            System.out.print("Enter your input ( " + massenger + " ) : ");
            
            while (true) {
                try {
                    double number = Double.parseDouble(this.getDataNext.nextLine());
                    if (min <= number && max >= number) return number;
                } 
                catch (NumberFormatException e) {
                    System.err.println("Your input is invalid" + "(" + warning + ")" );
                }
               System.out.print("Please, enter again your input ( " + massenger + " )  " + min + "  <= Value <= " + max + " : ");
             }
    }
      
      public int validationInputInt(String massenger, String warning, int min, int max) {
           System.out.print("Enter your input ( " + massenger + " ) : ");
           
            while (true) {
                try {
                    int number = Integer.parseInt(this.getDataNext.nextLine());
                    if (min <= number && number <= max) return number;
                } 
                catch (NumberFormatException e) {
                    System.err.println("Your input is invalid" + "(" + warning + ")" );
                }
                System.out.print("Please, enter again your input ( " + massenger + " )  " + min + "  <= Value <= " + max + " : ");
             }
    }

    public String validationInputOperator(String massenger) {
        Scanner getDataText = new Scanner(System.in);
        System.out.print("Enter your input ( " + massenger + " ) : ");
        String operator= getDataText.nextLine();
        
        while (operator == null || operator.length() == 0 || 
                !this.WarningOperatorInputInvalid(operator,  "(+, -, *, /, ^, =)")) {
            System.out.print("Please,  enter again your input " + massenger + " : ");
            operator = getDataText.nextLine();
        }
        return operator;
    }
    
    private boolean WarningOperatorInputInvalid(String operator, String warning) {
          if (this.operatorRegexPattern.matcher(operator).find() && operator.length() == 1) return true;
          System.out.println("Your input is invalid" + "(" + warning + ")" );
          return false;
    }

}
