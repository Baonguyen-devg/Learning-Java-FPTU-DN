package view;


import java.util.Scanner;

public class Validation {
    private  final Scanner input = new Scanner(System.in);
 private static final String DATE_VALID = "^\\d{1}|[0-3]{1}\\d{1}-[a-zA-Z]{3}-\\d{4}$";
   
    private  String getInputValue() {
        return input.nextLine().trim();
    }

   
 public String checkInputDate(String msg) {
     System.out.println(msg);
        while (true) {
            try {
                String result = getInputValue();
                if (result.matches(DATE_VALID)) {
                    return result;
                } else {
                    System.err.println("Re-input");
                }
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }
   
public double checkInputDouble(String msg) {
    System.out.println(msg);
        while (true) {
            try {
                double result = Double.parseDouble(getInputValue());
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }
     public  int checkInputInt(String msg) {
         System.out.println(msg);
        while (true) {
            try {
                int result = Integer.parseInt(getInputValue());
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }

   

  
     public int getInt(String msg, int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        while (true) {
            try {
                System.out.println(msg);
                int n = Integer.parseInt(getInputValue());
                if (min <= n && n <= max) {
                    return n;
                }
                System.err.println("PLEASE INPUT A NUMBER IN RANGE " + min + "->" + max);

            } catch (NumberFormatException e) {
            }
            System.err.println("WRONG FORMAT!");
        }
    }

    public String getString(String msg) {
        while (true) {
            System.out.println(msg);
            String s = getInputValue();
            if (!s.isEmpty()) {
                return s;
            }
            System.err.println("EMPTY STRING IS NOT ALLOWED !");
        }
    }

    public boolean getYN(String msg) {
        while (true) {
            System.out.println(msg);
            String s = getInputValue();
            if (s.equalsIgnoreCase("y")) {
                return true;
            } else if (s.equalsIgnoreCase("n")) {
                return false;
            }
            System.err.println("PLEASE INPUT ONLY Y/N");
        }
    }

}

