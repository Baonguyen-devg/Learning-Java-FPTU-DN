package valid;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidDate {
    
    private final Scanner getDataNext = new Scanner(System.in);
    private final Pattern operatorRegexPattern = Pattern.compile("[-+*/=^]");
    
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
    
    
    public static int validDateInputInt(String name){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while(number <= 0){
            System.out.println("Let enter + " + name + ": ");
            number = sc.nextInt();
        }
        return number;
    }
    
    public static int validDateInputInt(String name, int min, int max){
        Scanner sc = new Scanner(System.in);
        int number = min - 1;
        while(number < min || number > max){
            System.err.println("Let enter " + name + ": ");
            number = sc.nextInt();
        }
        return number;
    }
    public static String validDateInputEmpty(String name) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        while(s == null){
            System.out.println("Enter: " + name + ": ");
            s = sc.nextLine();
        }
        return s;
    }
    public static double validDateDouble(String name){
        Scanner sc = new Scanner(System.in);
        double number;
        number = sc.nextDouble();
        return number;
    }
    public static int validDateInputYear(){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while(number <1900){
            System.out.println("Please enter year(>=1900): ");
            number = sc.nextInt();
        }
        return number;
    }
}
