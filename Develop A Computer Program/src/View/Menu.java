package View;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Menu {
    protected String title = null;
    protected ArrayList<String> options = new ArrayList<>();

    protected Menu(String titleMenu, String[] options) {
        this.title = titleMenu;
        this.options.addAll(Arrays.asList(options));
    }
    
    protected void decorMenu() {
        System.out.println("\n## ---------------- MENU ------------- ##");
        System.out.println(title);
        System.out.println("## ---------------------------------------- ##");
        for (int i = 0; i < this.options.size(); i++) 
            System.out.println("Option." + (i + 1) + ". " + this.options.get(i));
    }
    
     protected int getChoice() throws NumberFormatException {
         this.decorMenu();
         return  Validation.getInstance().validationInputInt("chose",  
                 "The numbers of input about [0, 9]", 1, this.options.size());
    }
     
    public void run() {
        while (true) {
            int choice = this.getChoice();
            this.execute(choice);
            if (choice == this.options.size()) break;
        }
    }
 
      protected abstract void execute(int chose); 
}
