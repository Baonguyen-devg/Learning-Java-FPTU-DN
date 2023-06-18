package workshop2.Customer;

public class PotentialCustomer extends Customer {
    public PotentialCustomer(String name, int age) {
        super(name, age);
    }
    
    @Override
    void BuyCar(int pay) {
        this.money = this.money - pay / 2;
    }
   
}
