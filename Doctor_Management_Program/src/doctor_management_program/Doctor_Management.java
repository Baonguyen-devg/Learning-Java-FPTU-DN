package doctor_management_program;

import Validation.Menu;
import Model.Doctor;
import java.util.HashMap;
import java.util.Map;

public class Doctor_Management extends Menu{
    private static Doctor_Management instance = null;
    private Map<String, Doctor> doctorMap = new HashMap<>();
    //Singleton Pattern
    public static Doctor_Management getInstance() {
        if (instance == null) instance = new Doctor_Management();
        return instance;
    }
    
    static String[] menuOptions = {"Add Doctor", "Update Doctor", 
        "Delete Doctor", "Search Doctor", "Exits"};
    public Doctor_Management() { super("Doctor Management Program", menuOptions);  }

    private void addDoctor() {
        Doctor doc = new Doctor();
        doc.input();
        
    }
    
    private void updateDoctor() {
        
    }
    
    private void deleteDoctor() {
        
    }
    
    private void searchDoctor() {
        
    }
    
    
    @Override
    protected void execute(int chose) {
        switch (chose) {
            case 1: this.addDoctor(); break;
            case 2: this.updateDoctor(); break;
            case 3: this.deleteDoctor(); break;
            case 4: this.searchDoctor(); break;
            case 5: System.out.println("Exit successfully");
                System.exit(0); break;
            default:
        }        
    }
    
}
