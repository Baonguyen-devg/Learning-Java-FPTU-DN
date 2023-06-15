package lab211_day1;

import java.util.Scanner;
import static lab211_day1.Controller.array;

public class Common {
    public int GetInt(String messenger) {
        System.out.println(messenger);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    public void OutputArray(int Array[], int sizeArray, String messenger) {
        System.out.println(messenger);
        for (int i = 1; i <= sizeArray; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
