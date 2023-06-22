package view;

import java.util.Scanner;

public class Validation {

    private final Scanner input = new Scanner(System.in);

    private String getInputValue() {
        return input.nextLine().trim();
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
