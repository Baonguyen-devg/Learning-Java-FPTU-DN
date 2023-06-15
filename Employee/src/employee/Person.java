package employee;

import date.Date;
import valid.ToanHoc;
import valid.ValidDate;

public class Person {

    protected String firstName;
    protected String lastName;
    protected boolean gender;
    protected String phone;
    protected Address diaChiNha;
    protected Date dateOfBirth;

    public Person() {
        firstName = null;
        lastName = null;
        gender = true;
        phone = null;
        diaChiNha = new Address(); //moi
        dateOfBirth = new Date();
    }

    public Person(String firstName, String lastName, boolean gender, String phone, Address diaChiNha, Date dateOfBirth) {
        if (firstName != null) {
            this.firstName = firstName;
        }
        if (lastName != null) {
            this.lastName = lastName;
        }
        if (gender == true || gender == false) {
            this.gender = gender;
        }
        if (phone != null) {
            this.phone = phone;
        }
        this.diaChiNha = diaChiNha;//moi
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        if (gender == true || gender == false) {
            this.gender = gender;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null) {
            this.phone = phone;
        }
    }

    public Address getDiaChiNha() {
        return diaChiNha;
    }

    public void setDiaChiNha(Address diaChiNha) {
        this.diaChiNha = new Address();
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    protected String getNameGender(String gender) {
        if (gender.equals("Women")) return "You are not Men.\n";
        
        return this.firstName + " " + this.lastName + " " + this.gender;
    }
    
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.gender;
    }
    
    public void input(String name1, String name2, String name3, String name4) {
        firstName = ValidDate.validDateInputEmpty(name1);
        lastName = ValidDate.validDateInputEmpty(name2);
        gender = ToanHoc.inputLogic(name3);
        phone = ValidDate.validDateInputEmpty(name4);
        diaChiNha.input("number", "street", "ward", "district", "city");//moi
        dateOfBirth.input();
    }

    public void output() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + (gender ? "Male" : "Female"));
        System.out.println("Phone: " + phone);
        diaChiNha.output();//moi
        dateOfBirth.output();
    }

}
