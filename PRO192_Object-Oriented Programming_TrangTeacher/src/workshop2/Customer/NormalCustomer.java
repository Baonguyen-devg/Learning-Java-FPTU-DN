package workshop2.Customer;

public class NormalCustomer extends Customer{

    public NormalCustomer(String name, int age) {
        super(name, age);
    }

    @Override
    void BuyCar(int pay) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
