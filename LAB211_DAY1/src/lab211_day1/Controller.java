package lab211_day1;

import java.util.Random;

public class Controller {

    protected static int[] array;
    public static int sizeArray;

    public static void main(String[] args) {
        Menu createMenu = new Menu();
        createMenu.ShowMenu("Sort", "Search");
        Common variableCommon = new Common();
        Random generator = new Random();
        Sort createSort = new Sort();

        while (true) {
            int chose = variableCommon.GetInt("Enter your chose: ");
            if (chose == 3) {
                return;
            }

            sizeArray = variableCommon.GetInt("Enter number of array:");
            array = new int[sizeArray + 2];

            for (int i = 1; i <= sizeArray; i++) {
                array[i] = generator.nextInt(sizeArray);
            }

            variableCommon.OutputArray(array, sizeArray, "Array Unsorted: ");
            if (chose == 1) {
                createSort.BuddleSort(array, sizeArray);
            }
            if (chose == 2) {
                createSort.QuickSort(array, 1, sizeArray);
            }
            variableCommon.OutputArray(array, sizeArray, "Array Sorted: ");
        }

    }

}
