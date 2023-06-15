package workshop2;

public class Car {
    private String color;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    //SetFields in Class
    public void setColor(String color) { this.color = color; }
    public void setEnginePower(int enginePower) { this.enginePower = enginePower; }
    public void setConvertible(boolean convertible) { this.convertible = convertible; }
    public void setParkingBrake(boolean parkingBrake) { this.parkingBrake = parkingBrake; }

    //GetFields in Class
    public String getColor() { return this.color; }
    public int getEnginePower() { return this.enginePower; }
    public boolean isConvertible() { return this.convertible; }
    public boolean isParkingBrake() { return this.parkingBrake; }
    
    //ChangeAllField in Class
    public Car(String color, int enginePower, 
        boolean convertible, boolean parkingBrake){
        this.color = color;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }
    
    public void pressStartButton() {
        System.out.println("You have pressed the start buttom");
    }
    
    public void pressAccerlerator() {
        System.out.println("You have pressed the accerlerator buttom");
    }
    
    public void output() {
        System.out.println("Color: " + this.color);
        System.out.println("Engine Power: " + this.enginePower);
        System.out.println("Convertible: " + this.convertible);
        System.out.println("Parking Brake: " + this.parkingBrake);
    }
}
