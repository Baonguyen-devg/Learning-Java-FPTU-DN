package DoctorManagement.Requests;

import DoctorManagement.DesignPattern.ListDoctor;
import java.util.Scanner;
import DoctorManagement.Doctor;
import DoctorManagement.FormatClass;
import static DoctorManagement.FormatClass.input;
import DoctorManagement.DesignPattern.Strategy;

public class UpdateDoctor extends FormatClass implements Strategy {
    @Override
    public void Solve() {
        System.out.println("--------- Update Doctor ----------");
        input = new Scanner(System.in);
        System.out.print("Please enter the code of doctor: ");
        String key = input.nextLine();
        
        if (key == null || !ListDoctor.Instance.CheckExit(key)) {
            System.out.println("Code is null or doctor exits");
            return;
        }
        
        System.out.println("Please enter task information need Update:");
        System.out.println("1. Name.");
        System.out.println("2. Specialization");
        System.out.println("3. Availability:");
        System.out.print("Please enter your choice:");
        int chose = input.nextInt();
       
        Doctor dt = ListDoctor.Instance.FindDoctor(key);
        System.out.print("Please enter information for change: ");
        
        if (chose == 1 || chose == 2) {
            input = new Scanner(System.in);
            String valueChange  = input.nextLine();
            if (chose == 1) ListDoctor.Instance.ChangeInfoDoctor(dt, 
            valueChange, dt.specializationl, dt.availability);
            if (chose == 2) ListDoctor.Instance.ChangeInfoDoctor(dt, 
            dt.name, valueChange, dt.availability);  
        } 
        
        if (chose == 3) {
            input = new Scanner(System.in);
            int valueChange = input.nextInt();
            ListDoctor.Instance.ChangeInfoDoctor(dt, 
            dt.name, dt.specializationl, valueChange);
        }
        
        System.out.println("Update Successfull.");
    }
}
