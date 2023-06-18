package Model;

public class Rectangle {
    private int lenght;
    private int height;

    public Rectangle(int lenght, int height) {
        this.lenght = lenght;
        this.height = height;
    }
    
    public double calculateArea() {
        return this.lenght * this.height;
    }
    
    public double calculateFerence() {
        return (this.lenght + this.height) * 2;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangle other = (Rectangle) obj;
        if (this.lenght != other.lenght) {
            return false;
        }
        return this.height == other.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "lenght=" + lenght + ", height=" + height + '}';
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
