package carmanager;

public class Tester {

    public static void main(String[] args) {
        Car c = new Car();
        c.pressStartButton();
        c.pressAccelerator();
        c.Output();
        
        Car c2 = new Car("red", 100, true, true);
        c2.pressAccelerator();
        c2.setColour("black");
        System.out.println("Colour of c2:" + c2.getColour());
        c2.Output(); 
    }
  
}
