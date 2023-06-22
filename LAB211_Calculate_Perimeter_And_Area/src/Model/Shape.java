package Model;

public abstract class Shape {
    protected abstract double calculatePerimeter();
    protected abstract double calculateArea();
    public abstract void input();
    
    protected void printValuePerimeter() {
        System.out.println("Perimeter : " + this.calculatePerimeter());
    }
    
    protected void printValueArea() {
            System.out.println("Area: " + this.calculateArea());
    }
    
    public void result() {
        System.out.printf("Perimeter: %.2f\n", this.calculatePerimeter());
           System.out.printf("Area: %.2f\n", this.calculateArea());
    }
}
