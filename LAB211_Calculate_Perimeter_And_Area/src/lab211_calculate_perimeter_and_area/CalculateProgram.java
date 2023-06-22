package lab211_calculate_perimeter_and_area;
import Model.*;

public class CalculateProgram {

    public static void main(String[] args) {
        Circle shape1 = new Circle();
        shape1.input(); shape1.result();
        
        Rectangle shape2 = new Rectangle();
        shape2.input(); shape2.result();
        
        Triangle shape3 = new Triangle();
        shape3.input(); shape3.result();
    }
    
}
