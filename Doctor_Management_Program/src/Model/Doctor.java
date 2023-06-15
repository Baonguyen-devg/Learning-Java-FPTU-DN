package Model;
import java.util.Objects;
import Validation.Validation;

public class Doctor {
    private String code;
    private String name;
    private String specialization;
    private int Availability;
   
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public int getAvailability() { return Availability; }
    public void setAvailability(int Availability) { this.Availability = Availability; }   

    public void input() {
        this.code = Validation.getInstance().validationInputString("code");
        this.name = Validation.getInstance().validationInputString("name");
        this.specialization = Validation.getInstance().validationInputString("specialization");
        this.Availability = Validation.getInstance().validationInputInt("availability", 
                "exceeding", 0, Integer.MAX_VALUE);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
      
        final Doctor other = (Doctor) obj;
        if (this.Availability != other.Availability) return false;
        if (!Objects.equals(this.code, other.code)) return false;
        if (!Objects.equals(this.name, other.name)) return false;
        return Objects.equals(this.specialization, other.specialization);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.code);
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + Objects.hashCode(this.specialization);
        hash = 31 * hash + this.Availability;
        return hash;
    }
}
