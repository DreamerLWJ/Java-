package Day3.abstractDemo;


public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatedArea() {
        area = Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle.getArea());
    }
}
