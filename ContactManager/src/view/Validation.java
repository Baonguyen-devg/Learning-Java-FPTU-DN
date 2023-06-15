package view;

import java.util.Scanner;

public class Validation {

    private static final Scanner input = new Scanner(System.in);
    
    private static final String REGEX_PHONE = "[0-9]{10}";
    private static final String REGEX_NAME_ADDRESS_GROUP = "^([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})";
    

    private String getInputValue() {
        return input.nextLine().trim();
    }

//    public int inputChoice() {
//        while (true) {
//            try {
//                System.out.println("Enter your choice:");
//                return Integer.parseInt(getInputValue());
//            } catch (NumberFormatException e) {
//                System.err.println("Enter a number (Integer) !!!");
//            }
//        }
//    }
    // get choice, get int
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

     public String inputString(String msg) {
        System.out.println(msg);
        String str = getInputValue();
        while (!str.matches(REGEX_NAME_ADDRESS_GROUP)) {
            System.err.println("Invalid format, try again");
            str = getInputValue();
        }
        return str;
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

     public String inputPhone() {
        System.out.println("Enter Phone:");
        String phone = getInputValue();
        while (!phone.matches(REGEX_PHONE)) {
            System.err.println("Please input phone flow\n"
             +"1234567890\n"
              +"123-456-7890\n"
             +"123-456-7890 x1234\n"
              +"123-456-7890 ext1234\n"
               +" (123)-456-7890\n"
              +"123.456.7890\n"
              +"123 456 7890\n");
            System.out.println("Try again: ");

            phone = getInputValue();
        }
        return phone;
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
