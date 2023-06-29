package Model;
import Validation.Validation;

public class Circle extends Shape {
    protected double radius;

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    
    @Override
    protected double calculatePerimeter() {
        return Math.PI * (this.radius + this.radius);
    }

    @Override
    protected double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
    
     @Override
    public void input() {
         System.out.println("--------------------- Circle-------------------");
        this.radius = Validation.getInstance().validationInputDouble("radius", "Error", 0);
    }
    
}
