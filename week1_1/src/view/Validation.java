package view;


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
        } while (true);
        return n;
    }
     public String getBase(String mess){
         String base;
        String input;
        do {            
                    System.out.println(mess);
                    input = sc.nextLine();
                    if (input.matches("[1-3]")) {
                        switch (input) {
                            case "1":
                                base = "2";
                                break;
                            case "2":
                                base="10";
                                break;
                            default:
                                base = "16";
                                break;
                        }
                        
                    break;
                        
            } else
                    System.out.println("Invalid input");
        } while (true);
        return base;
    }
 //   
   

    public  Integer inputChoice() {
        while (true) {
            try {
                System.out.println("Enter your choice:");
                return Integer.valueOf(getInputValue());
            } catch (NumberFormatException e) {
                System.err.println("Enter a number (Integer) !!!");
            }
        }
    }

}

