package employee;

import date.Date;
import valid.ToanHoc;
import valid.ValidDate;

public class Employee extends Person {

    protected String id;
    protected String office;
    protected double allowance;
    protected double salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, boolean gender, String phone, Address diaChiNha, Date dateOfBirth, String id, String office, double allowance, double salary) {
        super(firstName, lastName, gender, phone, diaChiNha, dateOfBirth);
        if (id != null) {
            this.id = id;
        }
        if (office != null) {
            this.office = office;
        }
        if (allowance >= 0) {
            this.allowance = allowance;
        }
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        if (office != null) {
            this.office = office;
        }
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        if (allowance >= 0) {
            this.allowance = allowance;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
    
    @Override
    protected String getNameGender(String gender) {
        if (gender.equals("Gay")) {
            return "You are not Men and Women.\n";
        }
        return this.firstName + " " + this.lastName + " " + this.gender;
    }

    public void input(String name1, String name2, String name3, String name4, String name5, String name6, String name7, String name8) {
        super.input(name1, name2, name3, name4);
        id = ValidDate.validDateInputEmpty(name5);
        office = ValidDate.validDateInputEmpty(name6);
        allowance = ToanHoc.numberDoubleGe0(name7);
        salary = ToanHoc.numberDoubleGreater0(name8);
    }

    @Override
    public void output() {
        super.output();
        System.out.println("ID: " + id);
        System.out.println("Office: " + office);
        System.out.println("Allowance: " + allowance);
        System.out.println("Salary: " + salary);
    }

}
