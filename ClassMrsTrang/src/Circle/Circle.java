package Circle;

public class Circle {
    private static double Pi = 3.14;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double CalculateArea() {
        return this.radius * this.radius * Pi;
    }
    
    public double CalculatePerimeter() {
        return this.radius * Pi;
    }
}
