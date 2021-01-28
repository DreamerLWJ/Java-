package Day3.abstractDemo;

public class Rectangle extends Shape{
    private double x, y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void calculatedArea() {
        area = x * y;
    }
}
