package equation;
import valid.ToanHoc;
public class SquareEquation extends LinearEquation{
    private double a;
    
    public SquareEquation(){}
    
    public SquareEquation(double a, double b, double c){
        super(b, c);
        this.a = a;
       
    }
    
    public void setA(double a){
        this.a = a;
    }
    
    public double getA(){
        return a;
    }
    
    @Override
    protected String F(double a, double b) {
        return a + " - " + b + " = " + (a - b);
    }
    
    public void input(String name1,String name2,String name3){
        super.input(name2, name3);
        a = ToanHoc.anyNumberDouble(name1);
    }
    @Override
    void solution(){
         if(a == 0){
              super.solution();
          }
         else{
              double b2 = b/2;
              double delta = b2*b2 - a*c;
              if(delta < 0) System.out.println("Equation has no solution.");
              else if (delta == 0) System.out.println( "The equation has a double solution: x1 = x2 = " + (-b2/a));
              else{
                  System.out.println("The equation has 2 distinct solutions:");
                  System.out.println("x1 = " + ((-b2 + Math.sqrt(delta)) / a));
                  System.out.println("x2 = " + ((-b2 - Math.sqrt(delta)) / a));
              }
        }
    }
}
