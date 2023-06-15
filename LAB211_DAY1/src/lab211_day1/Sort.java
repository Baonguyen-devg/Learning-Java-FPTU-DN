package lab211_day1;

public class Sort {
    public void QuickSort(int array[], int low, int high) { 
        if (low < high) {
            int pi = partition(array, low, high); 
   
            QuickSort(array, low, pi - 1); 
            QuickSort(array, pi + 1, high); 
        } 
    } 
    
    public void Swap(int array[], int i, int j) {
        array[i] = array[i] + array[j]; 
        array[j] = array[i] - array[j]; 
        array[i] = array[i] - array[j];
    }
                                      
    public int partition(int array[], int L, int R) {
        int pi = array[R];  
        int i = (L - 1); 
        for (int j = L; j < R; j++) { 
           
            if (array[j] <= pi) { 
                i = i + 1;
                Swap(array, i, j);
            } 
        } 
   
        Swap(array, i + 1, R);
        return i + 1; 
    } 
    
    public void BuddleSort(int array[], int sizeArray) {
        for (int i = 1; i <= sizeArray; i++)
            for (int j = 1; j <= sizeArray - i; j++)
                if (array[j] > array[j + 1]) 
                    Swap(array, j, j + 1);
    }
}
