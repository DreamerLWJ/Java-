package Day3.abstractDemo;


public abstract class Shape {
    /**
     * �����������г�Ա����
     */
    protected double area;

    /**
     * ������󷽷�
     */
    public abstract void calculatedArea();

    /**
     * �����������зǳ��󷽷�
     * @return ���
     */
    public double getArea() {
        calculatedArea();
        return area;
    }
}
