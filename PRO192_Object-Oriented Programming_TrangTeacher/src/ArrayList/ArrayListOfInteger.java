package ArrayList;

public class ArrayListOfInteger {

    private int[] array;
    private int n;

    public ArrayListOfInteger() {
        this.array = new int[1];
        int n = 0;
    }

    public ArrayListOfInteger(int capacity) {
        this.array = new int[capacity];
        int n = 0;
    }

    public void Add(int x) {
        if (n == this.array.length) {
            int[] newArray = new int[this.array.length + 1];
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }

        this.array[this.array.length - 1] = x;
        n++;
    }

    public void Add(int index, int x) {
        if (index < 0 || index > n) {
            return;
        }

        if (n == this.array.length) {
            int[] newArray = new int[this.array.length * 2];
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }

        for (int i = n; i > index; i--) {
            this.array[i] = this.array[i - 1];
        }
        this.array[index] = x;
        n++;
    }

    //8 lop bao boc
    //Auto Boxing and Auto Unboxing 
    public Integer get(int index) {
        if (index < 0 || index >= n) {
            System.out.println("Index is invalid");
            return null;
        }

        return this.array[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= n) return;
        for (int i = index; i < n - 1; i++)
            this.array[i] = this.array[i + 1];
        this.array[--n] = 0;
    }
    
    public boolean contains(int x) {
       for (int i = 0; i < n; i++) 
           if (x == this.array[i]) return true;
       return false;
    }
    
    public void set(int index, int x) {
        if (index < 0 || index >= n) {
            System.out.println("Index is invalid");
            return;
        }

        this.array[index] = x;
    }

    public void output() {
        for (int i = 0; i < this.array.length; i++) {
            System.out.print(this.array[i] + " ");
        }
    }

    public boolean isEmpty() {
        return (n == 0);
    }

    public int size() {
        return n;
    }
}
