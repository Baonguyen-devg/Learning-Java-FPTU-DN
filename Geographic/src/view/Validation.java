package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {

    private final Scanner input = new Scanner(System.in);
    private final Pattern pName = Pattern.compile("^([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})?( ?)?([A-Z][a-z]{1,10})");
    private final Pattern pTerrain = Pattern.compile("^(Nice|Good|Medium|Bad)");

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

    public float getFloat(String msg) {

        while (true) {
            try {
                System.out.println(msg);
                float n = Float.parseFloat(getInputValue());
                if (n > 0) {
                    return n;
                }
                System.err.println("PLEASE INPUT A NUMBER > 0");

            } catch (NumberFormatException e) {
            }
            System.err.println("WRONG FORMAT!");
        }
    }

    public String getID(String msg) {
        while (true) {
            System.out.println(msg);
            String s = getInputValue();
            if (!s.isEmpty()) {
                return s.toUpperCase();
            }
            System.err.println("EMPTY STRING IS NOT ALLOWED !");
        }
    }

    public String getName(String msg) {
        while (true) {
            System.out.println(msg);
            String s = getInputValue();
            if (!s.isEmpty() && pName.matcher(s).find()) {
                return s;
            }
            System.err.println("Invalid input");
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
