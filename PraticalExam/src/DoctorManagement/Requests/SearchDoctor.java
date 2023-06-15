package DoctorManagement.Requests;

import DoctorManagement.DesignPattern.ListDoctor;
import java.util.Scanner;
import DoctorManagement.Doctor;
import DoctorManagement.FormatClass;
import static DoctorManagement.FormatClass.input;
import DoctorManagement.DesignPattern.Strategy;

public class SearchDoctor extends FormatClass implements Strategy {
    protected boolean isFind;
    
    @Override
    public void Solve() {
        System.out.println("--------- Search Doctor ----------");
        input = new Scanner(System.in);
        System.out.print("Please enter the code of doctor: ");
        String key = input.nextLine();
         
//        Doctor doctor = DoctorManagement.Instance.FindDoctor(key);
        System.out.println("--------- Result ------------");
        System.out.println("Code" + '\t' + "Name" + '\t' + "Specialization" + '\t' + "Availability");
        for (Doctor doctor: ListDoctor.Instance.listDoctor)
            if (doctor.code.equals(key)) { doctor.OutInfo(); this.isFind = true; }
        
        if (this.isFind) System.out.println("Search successfull.");
        else System.out.println("Search dont't successfull.");
    }
}
