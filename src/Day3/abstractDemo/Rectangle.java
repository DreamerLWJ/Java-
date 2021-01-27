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

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 4);
        area(rectangle);
    }

    static void area(Shape shape) {
        System.out.println(shape.getArea());
    }
}
