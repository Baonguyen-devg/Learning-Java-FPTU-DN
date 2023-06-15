package DoctorManagement;

public class Doctor {
    public String code; 
    public String name;
    public String specializationl;
    public int availability;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecializationl() {
        return specializationl;
    }

    public void setSpecializationl(String specializationl) {
        this.specializationl = specializationl;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
    
    public void setInfo(String name, String spe, int ava) {
        this.name = name;
        this.specializationl = spe;
        this.availability = ava;
    }
    
    public void OutInfo() {
        System.out.println(this.code + '\t' + this.name + '\t' + this.specializationl + '\t' + this.availability);
    }
}
