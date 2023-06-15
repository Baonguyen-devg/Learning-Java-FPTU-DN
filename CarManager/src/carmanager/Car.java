package carmanager;

public class Car {
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;
    
    public Car() { }
    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }

    public int getEnginePower() { return enginePower; }
    public void setEnginePower(int enginePower) { this.enginePower = enginePower; }

    public boolean isConvertible() { return convertible; }
    public void setConvertible(boolean convertible) { this.convertible = convertible; }

    public boolean isParkingBrake() { return parkingBrake; }
    public void setParkingBrake(boolean parkingBrake) { this.parkingBrake = parkingBrake; }
    
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }
    
    public void pressAccelerator() {
        System.out.println("You have pressed the Accelerator button");
    }
     
    public void Output() {
        System.out.println(this.colour + ' ' + this.enginePower + ' ' + this.convertible + ' ' + this.parkingBrake);
    }
}
