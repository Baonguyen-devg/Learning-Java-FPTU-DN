package Model;
import Validation.Validation;

public class Triangle extends Shape{
    protected double sideA, sideB, sideC;

    public double getSideA() { return sideA; }
    public void setSideA(double sideA) { this.sideA = sideA; }

    public double getSideB() { return sideB; }
    public void setSideB(double sideB) { this.sideB = sideB; }

    public double getSideC() { return sideC; }
    public void setSideC(double sideC) { this.sideC = sideC; }
 
    @Override
    protected double calculatePerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    protected double calculateArea() {
        double perimeter = this.calculatePerimeter();
        return Math.sqrt(perimeter * (perimeter - this.sideA) * (perimeter - this.sideB) * (perimeter - this.sideC));
    }
    
    @Override
     public void input() {
        System.out.println("--------------------- Triangle -------------------");
        this.sideA = Validation.getInstance().validationInputDouble("sideA", "Error", 0);
        this.sideB = Validation.getInstance().validationInputDouble("sideB", "Error", 0);
        this.sideC = Validation.getInstance().validationInputDouble("sideC", "Error", 0);
    }
    
}
