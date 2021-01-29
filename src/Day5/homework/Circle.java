package Day5.homework;

public class Circle implements Shape {
    public Circle(double r) {
        if (r < 0) {
            r = -r;
        }
        this.r = r;
        areaSize = Math.asin(1) * r * r;
        perimeterSize = 2.0 * Math.acos(-1) * r;
    }

    private double r;
    private double areaSize;
    private double perimeterSize;

    @Override
    public double area() {
        return areaSize;
    }

    @Override
    public double perimeter() {
        return perimeterSize;
    }

    @Override
    public String toString() {
        return "圆形\n面积为" + areaSize + "\n周长为" + perimeterSize;
    }

    @Override
    public Size compare(Object obj) {
        if (obj == null || obj.getClass() != Circle.class) {
            return null;
        }
        Circle obj1 = (Circle) obj;
        if (this.areaSize > obj1.areaSize) {
            return Size.GREATER;
        } else if (this.areaSize == obj1.areaSize) {
            return Size.EQUAL;
        } else {
            return Size.LESS;
        }
    }

}
