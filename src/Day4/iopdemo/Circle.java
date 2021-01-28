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
            // �ǿ�������һ�²Ž��бȽ�
            // Ȼ���������ת��(ǿ������ת��)
            Circle c = (Circle) o;

            if (this.r >= c.r) {
                // �뾶��Ϊ�Ƚϱ�׼
                return true;
            }
        }
        return false;
    }
}
