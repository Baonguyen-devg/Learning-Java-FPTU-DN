package ArrayList;

public class MyArrayList <Element>
{
     private Element[] array;
    private int n;

    public MyArrayList() {
        this.array = (Element[]) new Object[1];
        int n = 0;
    }

    public MyArrayList(int capacity) {
        this.array = (Element[]) new Object[capacity];
        int n = 0;
    }

    public void Add(Element x) {
        if (n == this.array.length) {
            Element[] newArray = (Element[]) new Object[this.array.length + 1];
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }

        this.array[this.array.length - 1] = x;
        n++;
    }

    public void Add(int index, Element x) {
        if (index < 0 || index > n) {
            return;
        }

        if (n == this.array.length) {
            Element[] newArray =  (Element[]) new Object[this.array.length + 1];
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
    public Element get(int index) {
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
        this.array[--n] = null;
    }
    
    public boolean contains(Element x) {
       for (int i = 0; i < n; i++) 
           if (x.equals( this.array[i])) return true;
       return false;
    }
    
    public void set(int index, Element x) {
        if (index < 0 || index >= n) {
            System.out.println("Index is invalid");
            return;
        }

        this.array[index] = x;
    }

    public void output() {
        for (int i = 0; i < this.array.length; i++) 
            System.out.print(this.array[i] + " ");
    }

    public boolean isEmpty() { return (n == 0); }
    public int size() {  return n; }
}
