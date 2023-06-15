package employee;

import date.Date;

public class Test {

    public static void main(String[] args) {

//        Address a1 = new Address();
//        a1.input("number", "street", "ward", "district", "city");
//        Date da1 = new Date();
//        da1.input();
//        Person p1 = new Person("trung", "nguyen", true, "113", a1, da1);
//        p1.output();
//
//        
        //Test person
        Person perOne = new Person();
        System.out.println("Result : " + perOne);
        
        Person perTwo = new Employee();
         System.out.println("Result : " + perTwo);
        
        Employee perThree = new Employee();
        System.out.println("Result : " + perThree);
        
        Employee perEROne = new Regular();
        System.out.println("Result: " + perEROne);
        
        Regular perERTwo = new Regular();
        System.out.println("Result: " + perERTwo);
    }
}
