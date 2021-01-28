package Day4.iopdemo;

public interface Comparable {

    /**
     * 两个对象进行比较
     * @param o1 比较对象
     * @param o2 比较对象
     * @return 如果为 true, 说明当前对象大于等于 o ,
     *          如果为 false, 说明 o 大于当前对象
     */
    boolean compare(Object o);
}
