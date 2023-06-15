package employee;

import valid.ToanHoc;
import date.Date;

public class Contract extends Employee {

    protected double gradeSalary;

    public Contract() {
    }

    public Contract(String firstName, String lastName, boolean gender, String phone, Address diaChiNha, Date dateOfbirth, String id, String office, double allowance, double salary, double gradeSalary) {
        super(firstName, lastName, gender, phone, diaChiNha, dateOfbirth, id, office, allowance, salary);
        if (gradeSalary > 0) {
            this.gradeSalary = gradeSalary;
        }
    }

    public double getGradeSalary() {
        return gradeSalary;
    }

    public void setGradeSalary(double gradeSalary) {
        if (gradeSalary > 0) {
            this.gradeSalary = gradeSalary;
        }
    }

    public void input(String name1, String name2, String name3, String name4, String name5, String name6, String name7, String name8, String name9) {
        super.input(name1, name2, name3, name4, name5, name6, name7, name8);
        gradeSalary = ToanHoc.numberDoubleGreater0(name9);
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Grade Salary: " + gradeSalary);
    }
}
