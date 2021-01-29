package Day5.homework;

public interface Shape {
    static enum Size {
        GREATER, EQUAL, LESS;
    }

    double area();

    double perimeter();

    Size compare(Object obj);

}
