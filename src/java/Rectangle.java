public class Rectangle {
    private int height;
    private int width;
    private int size;

    public Rectangle (int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle (int height, int width, int size) {
        this.height = height;
        this.width = width;
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double calculateArea(int height, int width) {
        int area = height * width;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle: " + "Height = " + height + ", Width = " + width;
    }

    /*
    public void printRectangle(int height, int width) {
        System.out.println("Rectangle: " + "Height: " + height + " Width:" + width);
    }
    */

    public void printRectangle() {
        System.out.println(toString());
    }

}


