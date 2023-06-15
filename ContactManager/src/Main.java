import model.Contact;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         Manager m = new Manager();
         ArrayList<Contact> lc = new ArrayList<>();
         while (true) {            
             m.showMenu();
        int choice = m.menuChoice();
        
        switch (choice) {
            case 1:
                m.createContact(lc);
                break;
                case 2:
                m.displayContact(lc);
                break;
                 case 3:
                     m.deleteContact(lc);
                break;
               case 4:
                return;
                
            default:
                throw new AssertionError();
        }
        }
       
    }
}
