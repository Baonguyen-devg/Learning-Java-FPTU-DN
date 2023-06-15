package DoctorManagement.DesignPattern;

import DoctorManagement.Doctor;
import java.util.ArrayList;

public class ListDoctor {
    protected static final ListDoctor instance = new ListDoctor();
    public static final ListDoctor Instance = instance;
    
    public ArrayList<Doctor> listDoctor = new ArrayList<>();
    
    public void ChangeInfoDoctor(String code, String name, String spe, int ava) {
        Doctor doctorChange = this.FindDoctor(code);
        if (doctorChange == null) return;
        doctorChange.setInfo(name, spe, ava);
    }
    
    public void ChangeInfoDoctor(Doctor doctor, String name, String spe, int ava) {
        doctor.setInfo(name, spe, ava);
    }
    
    public Doctor FindDoctor(String code) {
        for (Doctor doctor: this.listDoctor)
            if (code.equals(doctor.code)) return doctor;
        return null;
    }
    
    public boolean CheckExit(String code) {
        for (Doctor doctor: this.listDoctor)
            if (code.equals(doctor.code)) return true;
        return false;
    }
    
    public void Delete(Doctor doctor) {
        this.listDoctor.remove(doctor);
    }
    
    public void SortList() {
        for (int i = 0; i < this.listDoctor.size(); i++)
            for (int j = i + 1; j < this.listDoctor.size(); j++)
                if (this.listDoctor.get(i).code.compareTo(this.listDoctor.get(j).code) > 0) {
                    Doctor key = this.listDoctor.get(i);
                    Doctor key1 = this.listDoctor.get(j);
                    this.ChangeInfoDoctor(this.listDoctor.get(i), key1.name,key1.specializationl, key1.availability);
                    this.ChangeInfoDoctor(this.listDoctor.get(j), key.name, key.specializationl, key.availability);
                }
    }
}
