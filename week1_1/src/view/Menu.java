package view;

import java.util.ArrayList;
import java.util.Arrays;


public abstract class Menu {
    private Validation val = new Validation();
    private final String title;
    private final ArrayList<String> options = new ArrayList<>();

    public Menu(String title, String[] op) {
        this.title = title;
        this.options.addAll(Arrays.asList(op));
    }

    //display menu of functions
    public void menuDislay() {
        System.out.println("----------------------------------");
        System.out.println(title);
        System.out.println("----------------------------------");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }

    }

    //Enter user select
    public int getChoice() throws NumberFormatException {
        menuDislay();

        int choice = val.inputChoice();
        return choice;
    }

    // check data that user input
    public void run() {
        while (true) {

            int choice = getChoice();

            if (choice < 0 || choice > options.size()) {
                System.out.println("Your choice must in 0 - " + options.size());
                continue;
            }
            execute(choice);
            if (choice == options.size()) break;
        }
    }

    public abstract void execute(int n);
}

