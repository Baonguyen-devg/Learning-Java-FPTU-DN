package DoctorManagement.Requests;

import DoctorManagement.DesignPattern.ListDoctor;
import java.util.Scanner;
import DoctorManagement.FormatClass;
import static DoctorManagement.FormatClass.input;
import DoctorManagement.DesignPattern.Strategy;

public class DeleteDoctor extends FormatClass implements Strategy {
    @Override
    public void Solve() {
        System.out.println("--------- Delete Doctor ----------");
        input = new Scanner(System.in);
        System.out.print("Please enter the code of doctor: ");
        String key = input.nextLine();
         
        if (key == null || !ListDoctor.Instance.CheckExit(key)) {
            System.out.println("Code is null or doctor don't exit");
            return;
        }
        
        ListDoctor.Instance.Delete(ListDoctor.Instance.FindDoctor(key));
        System.out.println("Delete Successfull.");
    }
}

