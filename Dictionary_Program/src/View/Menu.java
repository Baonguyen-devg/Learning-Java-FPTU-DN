package View;
import Validation.Validation;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Menu {
    protected String title = "Welcome to Menu";
    protected ArrayList<String> options = new ArrayList<String>();
    
    public Menu() {}
    public Menu(String titleName, String[] op) {
        this.title = titleName;
        this.options.addAll(Arrays.asList(op));
    }
    
    protected void decorMenu() {
        System.out.println("");
        System.out.println("------------------- " + this.title + " ------------------------");
        System.out.println("##------------------------------------------------##");
        System.out.println("There are " + this.options.size() + " options: ");
        for (int i = 0; i < this.options.size(); i++)
                System.out.println("Option " + (i + 1) + " . " + this.options.get(i));
        System.out.println("##------------------------------------------------##");
    }
    
    protected int getChoice() throws NumberFormatException {
         this.decorMenu();
         return  Validation.getInstance().validationInputInt("chose",  
                 "The numbers of input about [0, 9]", 1, this.options.size());
    }
     
    protected void run() {
        while (true) {
            int choice = this.getChoice();
            this.execute(choice);
            if (choice == this.options.size()) break;
        }
    }
    
    protected abstract void execute(int chose); 
}
