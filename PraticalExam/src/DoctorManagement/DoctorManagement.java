package DoctorManagement;
import DoctorManagement.DesignPattern.BuildProblem;
import DoctorManagement.Requests.AddDoctor;
import DoctorManagement.Requests.DeleteDoctor;
import DoctorManagement.Requests.SearchDoctor;
import DoctorManagement.Requests.SortListDoctor;
import DoctorManagement.Requests.UpdateDoctor;
import java.util.Scanner;

public class DoctorManagement extends FormatClass {
    protected static BuildProblem buildProblem;
    
    public static void AutoBehavior() {
        input = new Scanner(System.in);
    }
    
    public static void CreateMenu() {
        System.out.println("======== Doctor Management =======");
        System.out.println("1. Add a doctor.");
        System.out.println("2. Update Doctor.");
        System.out.println("3. Delete Doctor.");
        System.out.println("4. Search Doctor.");
        System.out.println("5. Sort List of Doctor.");
        System.out.println("6. Exits");
        System.out.println("==================================");
    }
    
    public static void main(String[] args) {
        CreateMenu();
        AutoBehavior();
        
        while(true) {
            System.out.print("Let's entry your choice: ");
            int chose = input.nextInt();
            
            if (chose == 1) buildProblem = new BuildProblem(new AddDoctor());
            if (chose == 2) buildProblem = new BuildProblem(new UpdateDoctor());
            if (chose == 3) buildProblem = new BuildProblem(new DeleteDoctor());
            if (chose == 4) buildProblem = new BuildProblem(new SearchDoctor());
            if (chose == 5) buildProblem = new BuildProblem(new SortListDoctor());
            if (chose == 6) return;
            buildProblem.SolveProblem();
        }
        
    }
    
}
