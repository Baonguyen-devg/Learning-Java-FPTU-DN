package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {

    private final Scanner input = new Scanner(System.in);

    private final Pattern pPhone = Pattern.compile("[0-9]{10}");
    private final SimpleDateFormat pDate = new SimpleDateFormat( "dd/MM/yyyy");
    private final Pattern pEmail = Pattern.compile("[A-Za-z0-9_.]+@[A-Za-z]+([.])[A-Za-z]+");

    private String getInputValue() {
        return input.nextLine().trim();
    }

    public String checkEmail(String msg) {

        while (true) {

            System.out.println(msg);
            String n = getInputValue();
            if (pEmail.matcher(n).matches()) {
                return n;
            }
            System.err.println("Email must be correct format");

        }
    }

    public String checkDate(String msg) {
       
        while (true) {
           
                System.out.println(msg);
                String n = getInputValue();
               pDate.setLenient(false); // Disable lenient parsing

        try {
            pDate.parse(n);
            return n; // Parsing succeeded, so the format is valid
        } catch (Exception e) {
            System.err.println("Date to correct format(dd/MM/yyyy)"); // Parsing failed, so the format is invalid
        }

            
        }
    }

    public String checkPhone(String msg) {

        while (true) {

            System.out.println(msg);
            String n = getInputValue();
            if (pPhone.matcher(n).matches()) {
                return n;
            } else if (n.length() < 10) {
                System.err.println("Phone number must be 10 digits");
            } else {
                System.err.println("Phone number must be number");
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
