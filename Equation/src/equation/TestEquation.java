package equation;

public class TestEquation {
    public static void main(String[] args) {
        SquareEquation sq1 = new SquareEquation();
        System.out.println(" Result: " + sq1.F(1245, 3434));
        
        LinearEquation ln1 = new LinearEquation();
        System.out.println(" Result: " + ln1.F(1245, 3434));
        
        LinearEquation ls1 = new SquareEquation();
        System.out.println(" Result: " + ls1.F(1245, 3434));
    }
    
}
