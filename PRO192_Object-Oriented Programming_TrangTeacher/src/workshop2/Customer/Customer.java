package workshop2.Customer;
import java.util.Scanner;
import workshop2.Car;

public abstract class Customer {
    private String name;
    private int age;
    private Car requestCar;
    protected int money;
    
    public int getMoney() { return money; }
    public String getName() { return name; }
    public int getAge() { return age; }
  
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setMoney(int money) { this.money = money; }
    
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void Output() {
        System.out.println("Name of customer: " + this.name);
        System.out.println("Age of customer: " + this.age);
    }
    
    public Car Request() {
        Scanner input = new Scanner(System.in);
        System.out.print("Name: "); 
        this.requestCar.setColor(input.nextLine());
        System.out.print("Engine Power: "); 
        this.requestCar.setEnginePower(input.nextInt());
        System.out.print("Convertible (0 or 1): "); 
        this.requestCar.setConvertible((input.nextInt() == 1));
        System.out.print("Parking Brake (0 or 1): "); 
        this.requestCar.setParkingBrake((input.nextInt() == 1));
        return this.requestCar;
    }
    
    abstract void BuyCar(int pay);
}
