package Controller;

import View.Menu;
import View.Validation;
import Model.Pair;

public class ComputerProgram extends Menu {

    private static ComputerProgram instance;

    public static ComputerProgram getInstance() {
        if (instance == null) instance = new ComputerProgram();
        return instance;
    }

    Pair<Double, Double>[] pairNumbers = (Pair<Double, Double>[]) new Pair<?, ?>[]{
         new Pair<>(0.0, 19.0), new Pair<>(19.0, 25.0),
         new Pair<>(25.0, 30.0), new Pair<>(30.0, 40.0),
         new Pair<>(40.0, Double.MAX_VALUE)
    };

    static String[] menuOptions = {"Normal Calculator", "BMI Calculator", "Exit"};
    private String[] standards = {"Under - standard", " Standard", "Overweight",
        "Fat - should lose weight", "Very far - should lose weight immediately"};

    public ComputerProgram() { super("Computer Program", menuOptions);  }

    private void normalCalculator() {
        System.out.println("----- Normal Calculator -----");
        double result = Validation.getInstance().validationInputDouble
        ("Number", "It must be digit", Integer.MIN_VALUE);

        while (true) {
            String operator = Validation.getInstance().validationInputOperator("Operator");
            if (operator.equals("=")) break;
            double number = Validation.getInstance().validationInputDouble
            ("Number", "It must be digit", Integer.MIN_VALUE);
            
            result =  this.calculate(result, number, operator);
            System.out.println("Memory : " + result);
        }
        System.out.println("Result: " + result);
    }

    private double calculate(double numberA, double numberB, String operator) {
        switch (operator.charAt(0)) {
            case '+': return numberA + numberB;
            case '-': return numberA - numberB;
            case '*': return numberA * numberB;
            case '/': return numberA / numberB;
            case '^': return Math.pow(numberA, numberB);
            default:
        }
        return 0;
    }

    private double getBMINumber() {
        double height = Validation.getInstance().validationInputDouble("Height (cm)", "BMI is digit", 0);
        double weight = Validation.getInstance().validationInputDouble("Weight (kg)", "BMI is digit", 0);
        return weight / (height * height);
    }

    private void BMICalculator() {
        System.out.println("----- BMI Calculator -----");
        double BMINumber = this.getBMINumber() * 10000;
        System.out.println("BMI number: " + String.format("%.2f",  BMINumber));

        for (int i = 0; i < this.pairNumbers.length; i++) 
            if (this.pairNumbers[i].getFirst() <= BMINumber && this.pairNumbers[i].getSecond() > BMINumber) 
                System.out.println("BMI Status: " + this.standards[i]);
    }

    @Override
    protected void execute(int chosen) {
        switch (chosen) {
            case 1: this.normalCalculator(); break;
            case 2: this.BMICalculator(); break;
            case 3: System.out.println("Exit successfully");
                System.exit(0); break;
            default:
        }
    }

}
