package DoctorManagement.Requests;

import DoctorManagement.DesignPattern.ListDoctor;
import DoctorManagement.FormatClass;
import DoctorManagement.DesignPattern.Strategy;

public class SortListDoctor extends FormatClass implements Strategy {
    @Override
    public void Solve() {
        System.out.println("--------- Sort Doctor ----------");
        ListDoctor.Instance.SortList();
        System.out.println("Sort Successfull.");
    }
}

