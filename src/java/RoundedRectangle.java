public class RoundedRectangle extends Rectangle{
    private int roundRadius = 2;

    public RoundedRectangle(int height, int width) {
        super(height, width);
    }

    public RoundedRectangle(int height, int width, int size) {
        super(height, width, size);
    }

    public int getRoundRadius() {
        return roundRadius;
    }

    public void setRoundRadius(int roundRadius) {
        this.roundRadius = roundRadius;
    }

    @Override
    public double calculateArea(int height, int width) {
        return (getHeight()*getWidth())-(4*(roundRadius*roundRadius))+(roundRadius*roundRadius*Math.PI);
    }

    @Override
    public String toString() {
        return "Rectangle: " + "Height = " + super.getHeight() + ", Width = " + getWidth() + "Radius = " + roundRadius;
    }

    @Override
    public void printRectangle() {
        System.out.println(toString());
    }
}
