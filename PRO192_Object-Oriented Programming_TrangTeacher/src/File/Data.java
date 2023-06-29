package File;

import ArrayList.MyArrayList;
import Model.Rectangle;
import Model.Shape;
import Model.Triangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Data {

    private static Data instance = null;

    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }

    public static void load(String nameFile) throws FileNotFoundException {
        File file = new File(nameFile);
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }

    public static void save(String nameFile) throws FileNotFoundException, IOException {
        File file = new File(nameFile);
        FileWriter fw = new FileWriter(file, true);
        try (PrintWriter pw = new PrintWriter(fw)) {
            pw.append("Nguyen Tien Thanh");
        }
    }

    public static void readInformation(String nameFile, MyArrayList<Shape> larr) throws FileNotFoundException {
        File file = new File(nameFile);
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String line = sc.nextLine();
             String[] s = line.split(",");
             if (s[0].equalsIgnoreCase("Rectangle")) {
                 double dai = Double.parseDouble(s[1].trim());
                 double rong = Double.parseDouble(s[2].trim());
                 larr.Add(new Rectangle(dai, rong));
             } else if (s[0].equalsIgnoreCase("Triangle")) {
                 double sideA = Double.parseDouble(s[1].trim());
                 double sideB = Double.parseDouble(s[2].trim());
                 double sideC = Double.parseDouble(s[3].trim());
                 larr.Add(new Triangle(sideA, sideB, sideC));
             } else {
                 System.out.println("Don't find shape information in file");
             }
        }
    }

    public static void main(String[] args) throws IOException {
        Data.save("Data");
        Data.load("Data");
    }
}
