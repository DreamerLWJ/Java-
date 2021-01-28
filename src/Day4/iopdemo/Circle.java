package Day4.iopdemo;

public class Circle implements Comparable{
    private double r;
    private double s;

    public Circle(double r) {
        this.r = r;
        s = Math.PI * r * r;
    }

    @Override
    public boolean compare(Object o) {
        if (o != null && o.getClass() == Circle.class) {
            // 非空且类型一致才进行比较
            // 然后进行向上转型(强制类型转换)
            Circle c = (Circle) o;

            if (this.r >= c.r) {
                // 半径作为比较标准
                return true;
            }
        }
        return false;
    }
}
