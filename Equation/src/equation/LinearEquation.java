package equation;
import valid.ToanHoc;
public class LinearEquation {
    protected double b;
    protected double c;
    
    public LinearEquation(){}
    
    public LinearEquation(double b, double c){
        this.b = b;
        this.c = c;
    }
    
    public void setB(double b){
        this.b = b;
    }
    
    public double getB(){
        return b;
    }
    
    public void setC(double c){
        this.c = c;
    }
    
    public double getC(){
        return c;
    }
    
    protected String F(double a, double b) {
        return a + " + " + b + " = " + (a + b);
    }
    
    public void input(String name1, String name2){
        b = ToanHoc.anyNumberDouble(name1);
        c = ToanHoc.anyNumberDouble(name2);
    }
    
    void solution(){
        if(b == 0){
            if(c == 0) System.out.println("The equation has infinitely many solutions.");
            else System.out.println("Equation has no solution.");
        }
        else System.out.println("x = " + (-c/b));
    }
}
