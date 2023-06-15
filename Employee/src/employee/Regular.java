package employee;

import valid.ToanHoc;
import date.Date;

public class Regular extends Employee {

    protected int yearsOfExperience;
    protected double rate;
    protected double basicSalary;

    public Regular() {
    }

    public Regular(String firstName, String lastName, boolean gender, String phone, Address diaChiNha, Date dayOfBirth, String id, String office, double allowance, double salary, int yearsOfExperience, double rate, double basicSalary) {
        super(firstName, lastName, gender, phone, diaChiNha, dayOfBirth, id, office, allowance, salary);
        if (yearsOfExperience > 0) {
            this.yearsOfExperience = yearsOfExperience;
        }
        if (rate > 0 && rate <= 100) {
            this.rate = rate;
        }
        if (basicSalary > 0) {
            this.basicSalary = basicSalary;
        }
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience >= 0) {
            this.yearsOfExperience = yearsOfExperience;
        }
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (rate > 0 && rate <= 100) {
            this.rate = rate;
        }
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary > 0) {
            this.basicSalary = basicSalary;
        }
    }

    public void input(String name1, String name2, String name3, String name4, String name5, String name6, String name7, String name8, String name9, String name10, String name11) {
        super.input(name1, name2, name3, name4, name5, name6, name7, name8);
        yearsOfExperience = ToanHoc.numberGeZeroInt(name9);
        rate = ToanHoc.inputRate(name10);
        basicSalary = ToanHoc.numberDoubleGreater0(name11);
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Basic Salary: " + basicSalary);
    }

}
