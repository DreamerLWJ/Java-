package Day3.abstractDemo;


public abstract class Shape {
    /**
     * 抽象类允许有成员变量
     */
    protected double area;

    /**
     * 定义抽象方法
     */
    public abstract void calculatedArea();

    /**
     * 抽象类允许有非抽象方法
     * @return 面积
     */
    public double getArea() {
        calculatedArea();
        return area;
    }
}
