import model.Contact;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager {
     private Scanner sc = new Scanner(System.in);
    public void showMenu(){
        
        System.out.println("Display the menu: ");
        System.out.println("1. Add a contact");
        System.out.println("2. Display all contact");
        System.out.println("3. Delete a contact");
        System.out.println("4. Exit");
        
    }
    
    public int menuChoice(){
        int choice = getInt("Enter your choice");
        return choice;
    }
    
    public int getInt(String mess){
        while(true){
            try {
                String result = getLine(mess);
                int choice;
                if(checkInteger(result)){ choice = Integer.parseInt(result);
                return choice;}
                else{
                    throw new NumberFormatException();
                }
                

            } catch (NumberFormatException e) {
            }
        }
    }
     public boolean checkInteger(String str){
        Pattern pattern = Pattern.compile("^\\d+");// car integer and double deu dc
       
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
     
     public String checkInputPhone(){
         String pattern = "^(\\()?(\\d{3})(\\))?[- ]?(\\d{3})[- ]?(\\d{4})( ext\\d+)?$";
         while(true){
             String result = getLine("Enter phone: ");
             
       
       
        if (result.matches(pattern)) {
            return result;
        } 
             System.err.println("Please input phone flow\n"
             +"1234567890\n"
              +"123-456-7890\n"
             +"123-456-7890 x1234\n"
              +"123-456-7890 ext1234\n"
               +" (123)-456-7890\n"
              +"123.456.7890\n"
              +"123 456 7890\n"
                                                     );
             System.out.println("Enter again: ");
         }
     }
      public String getLine (String mess){
        System.out.println(mess);
        return sc.nextLine();
    }
       public static int generateID(ArrayList<Contact> list_c){
        int id = 0;
        if (list_c.isEmpty()) {
            return 1;
        } else {
            for (Contact fruit : list_c) {
                if (fruit.getId()== list_c.size()-1) {
                    id = fruit.getId();
                }
            }
        }
        return id;
    }
      public void createContact(ArrayList<Contact> lc){
          int id = generateID(lc);
          String firstName = getLine("Enter first name: ");
          String lastName = getLine("Enter last name");
          String group = getLine("Enter group: ");
          String address = getLine("Enter Address: ");
          String phone = checkInputPhone();
          lc.add(new Contact(id, firstName+" "+lastName,group, address, phone, firstName, lastName));
          System.err.println("Add successfully");
          
      }
      
      
      
      public void displayContact(ArrayList<Contact> lc){
          for (Contact c : lc) {
             System.out.printf("%d - %s - %s - %s - %s - %s - %s\n", c.getId(), c.getFullName(), c.getFirstName(),
                  c.getLastName(), c.getGroup(), c.getAddress(), c.getPhone());

          }
      }
      public Contact getContactById(ArrayList<Contact> lc, int idDel){
          for (Contact c : lc) {
              if (c.getId()==idDel) {
                  return c;
              }
          }
          return null;
      }
      
      public void deleteContact(ArrayList<Contact> lc){
          int idDel = getInt("Enter id to delete contact");
          Contact c = getContactById(lc, idDel);
          if(c==null){
              System.err.println("not found contact");
          }
          else {
              lc.remove(c);
          }
                        System.err.println("delete successfully");

      }
}
