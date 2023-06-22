package Model;
import Validation.Validation;

public class Rectangle extends Shape{
    protected double widthLength;
    protected double heightLength;

    public double getWidthLength() { return widthLength; }
    public void setWidthLength(double widthLength) { this.widthLength = widthLength; }

    public double getHeightLength() { return heightLength; }
    public void setHeightLength(double heightLength) { this.heightLength = heightLength; }
 
    @Override
    protected double calculatePerimeter() {
       return (this.heightLength + this.widthLength) * 2;
    }

    @Override
    protected double calculateArea() {
       return this.heightLength * this.widthLength;
    }
    
      @Override
     public void input() {
        System.out.println("--------------------- Rectangle -------------------");
        this.heightLength = Validation.getInstance().validationInputDouble("height", "Error", 0);
        this.widthLength = Validation.getInstance().validationInputDouble("width", "Error", 0);
    }
    
}
