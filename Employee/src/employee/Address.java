package employee;

import valid.ValidDate;

public class Address {

    private int number;
    private String street, ward, district, city;

    public Address() {
    }

    public Address(int number, String street, String ward, String district, String city) {
        if (number > 0) {
            this.number = number;
        }
        this.street = street;
        this.ward = ward;
        this.district = district;
        this.city = city;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void input(String name1, String name2, String name3, String name4, String name5) {
        number = ValidDate.validDateInputInt(name1, 1, 100);
        street = ValidDate.validDateInputEmpty(name2);
        ward = ValidDate.validDateInputEmpty(name3);
        district = ValidDate.validDateInputEmpty(name4);
        city = ValidDate.validDateInputEmpty(name5);
    }

    public void output() {
        System.out.println(number + " - " + street + " - " + ward + " - " + district + " - " + city);
    }
}
