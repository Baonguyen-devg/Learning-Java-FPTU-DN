/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;


import view.Validation;

/**
 *
 * @author Thanh
 */
public class Algorithm {
    ThuVien tv = new ThuVien();
    Validation val = new Validation();
    
    
   
   
    // bubble sort
    public void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                } 
            }
        }
        
    }
    // quick sort
    /* This function takes last element as pivot, places the pivot element at its correct position in sorted array,
    and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot */
    public void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
        int partitionIndex = partition(arr, begin, end);

        quickSort(arr, begin, partitionIndex-1);
        quickSort(arr, partitionIndex+1, end);
    }
}
    private int partition(int arr[], int begin, int end) {
         // pivot (Element to be placed at right position)
    int pivot = arr[end];
    int i = (begin-1); // Index of smaller element

    for (int j = begin; j < end; j++) {
        // If current element is smaller than the pivot
        if (arr[j] <= pivot) {
            i++;// increment index of smaller element

            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
        }
    }

    int swapTemp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = swapTemp;

    return i+1;
}
    
    // linear search
    public void linearSearch (){
         //1. enter a positive number
        int size_array = val.getInt("Enter number of array: ");
        //2. create array by generate random in range
        int[] array = tv.createArray(size_array);
        //3. Display first sort
        System.out.println("Array: ");
        tv.display(array);
        int value = val.getInt("Enter number you want to search: ");
        
        for (int i = 0; i < size_array; i++) {
            if (value==array[i]) {
                System.out.println("Found " + value + " at index" + i);
            }
        }
    }

    // binary search
     public int binSearch(int[] a, int value, int left, int right){
        if (left>right) 
            return -1;
            
        int middle = (left+right)/2;
        if(a[middle]==value) return middle;
        if (a[middle]> value) 
            return binSearch(a, value, left, middle-1);
        
        return binSearch(a, value, middle+1, right);
    }
     
}
