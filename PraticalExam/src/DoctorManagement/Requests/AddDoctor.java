package DoctorManagement.Requests;

import DoctorManagement.DesignPattern.ListDoctor;
import java.util.Scanner;
import DoctorManagement.Doctor;
import DoctorManagement.FormatClass;
import DoctorManagement.DesignPattern.Strategy;
import static DoctorManagement.FormatClass.input;

public class AddDoctor extends FormatClass implements Strategy {
    protected Doctor doctor = new Doctor();
    
    @Override
    public void Solve() {
        System.out.println("--------- Add Doctor ----------");
        input = new Scanner(System.in);
        System.out.println("Please enter task information including code, "
        + "name, specialization, availability");
        System.out.print("Code: "); 
        
        String key = input.nextLine();
         if (key == null || ListDoctor.Instance.CheckExit(key)) {
            System.out.println("Code is null or doctor exits");
            return;
        }
        
        this.doctor.code = key;
        System.out.print("Name: ");
        this.doctor.name = input.nextLine();
        
        System.out.print("Specialization: ");
        this.doctor.specializationl = input.nextLine();
        
        System.out.print("Availability: ");
        this.doctor.availability = input.nextInt();
        
        ListDoctor.Instance.listDoctor.add(this.doctor);
        System.out.println("Add Successfull.");
    }
}