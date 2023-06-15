package view;


import java.io.IOException;
import java.util.Scanner;

public class Validation {
    private final Scanner sc = new Scanner(System.in);

    private String getInputValue() {
        return sc.nextLine().trim();
    }
//
    public int getInt(String mess){
        
        int n =0;
        String input;
        do {            
                    System.out.println(mess);
                    input = sc.nextLine();
                    if (input.matches("^[0-9]+([,.][0-9]?)?$")) {
            n = Integer.parseInt(input);
                    break;
                       
            } else
                     System.out.println("Invalid input");
                        continue;
        } while (true);
        return n;
    }
    public String getLine(String mess){
        System.out.println(mess);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().trim();
    }
     public double getDouble(String mess){
        double n =0;
        String input;
        do {            
                    System.out.println(mess);
                    input = sc.nextLine();
                    if (input.matches("^[0-9]+([,.][0-9]?)?$")) {
            n = Double.parseDouble(input);
                    break;
                       
            } else
                     System.out.println("Invalid input");
                        continue;
        } while (true);
        return n;
    }
     public int getBase(String msg, String err){
        while (true) {            
            System.out.println(msg);
            int base = Integer.parseInt(getInputValue());
            if(base==2|| base==10||base==16)
                return base;
            System.out.println(err);
            }
        }

    
    public String getValue(String msg, String err, int base){
        while (true) {            
            try {
                System.out.println(msg);
                String value = getInputValue();
                switch (base) {
                    case 2:
                        if (value.matches("[0-1]+")) {
                            return value;
                        }
                        break;
                    case 10:
                        if (value.matches("[0-9]+")) {
                            return value;
                        }
                        break;
                    case 16:
                        if (value.matches("[0-9a-fA-F]+")) {
                            return value;
                        }
                        break;
                    
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
    }
 //   
   

    public  Integer inputChoice() {
        while (true) {
            try {
                System.out.println("Enter your choice:");
                return Integer.parseInt(getInputValue());
            } catch (NumberFormatException e) {
                System.err.println("Enter a number (Integer) !!!");
            }
        }
    }

}

