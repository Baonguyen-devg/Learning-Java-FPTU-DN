package ArrayList;

import View.Validation;

public class Controller_Integer {
    public static int sum(MyArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) 
            sum = sum + arr.get(i);
        return sum;
    }
    
    //tinh trung binh cong cac so chan trong doi tuong mang arr
    //tim so lon nhat trong doi tuong mang arr
    //xoa cac gia tri am trong doi tuong mang arr
    //tim x co trong mang doi tuong mang arr khong. Neu co thi in ra "X co trong mang ", nguojc lai "ko co trong mang"
    //sap xep cac doi tuong mang tang dan
    //in ra cac gia tri bang x trong doi tuong mang arr
    
    public static void input(MyArrayList<Integer> arr) {
        int number = Validation.getInstance().validationInputInt
        ("Enter the number of Array", "Error", 0, 0x3c3c3c3c);
        for (int i = 0; i < number; i++) 
            arr.Add(Validation.getInstance().validationInputInt("x: ", "Error", 0, 0x3c3c3c3c));
    }
    
    public static void main(String[] args) {
        
    }
}
