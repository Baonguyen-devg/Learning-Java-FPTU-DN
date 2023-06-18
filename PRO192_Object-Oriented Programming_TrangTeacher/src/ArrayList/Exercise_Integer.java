package ArrayList;

import Validation.Validation;
import static java.lang.Integer.max;

public class Exercise_Integer {
    

    public static int sum(MyArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
        }
        return sum;
    }

    //tinh trung binh cong cac so chan trong doi tuong mang arr
    public static double average(MyArrayList<Integer> arr) {
        return sum(arr) / arr.size();
    }

    //tim so lon nhat trong doi tuong mang arr
    public static int maxValue(MyArrayList<Integer> arr) {
        int maxV = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            maxV = max(maxV, arr.get(i));
        }
        return maxV;
    }

    //xoa cac gia tri am trong doi tuong mang arr
    public static void removeNegativeValue(MyArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                arr.remove(i);
            }
        }
    }

    //tim x co trong mang doi tuong mang arr khong. Neu co thi in ra "X co trong mang ", nguojc lai "ko co trong mang"
    public static boolean findX(MyArrayList<Integer> arr, int x) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                return true;
            }
        }
        return false;
    }

    //sap xep cac doi tuong mang tang dan
    public static void sort(MyArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    arr.set(i, arr.get(i) + arr.get(j));
                    arr.set(j, arr.get(i) - arr.get(j));
                    arr.set(i, arr.get(i) - arr.get(j));
                }
            }
        }
    }

    //in ra cac gia tri bang x trong doi tuong mang arr
    public static void FindElementsX(MyArrayList<Integer> arr, int x) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                System.out.println(i + " ");
            }
        }
    }

    public static void input(MyArrayList<Integer> arr) {
        int number = Validation.getInstance().validationInputInt("Enter the number of Array", "Error", 0, 0x3c3c3c3c);
        for (int i = 0; i < number; i++) {
            arr.Add(Validation.getInstance().validationInputInt("x: ", "Error", 0, 0x3c3c3c3c));
        }
    }

    public static void main(String[] args) {

    }
}
