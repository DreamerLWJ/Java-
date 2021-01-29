package Day4.packingdemo;


import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int i = 1234;
        double d = 2.345;

        String s1 = Integer.toString(i);
        String s2 = Double.toString(d);

        int i1 = Integer.parseInt(s1);
        double d1 = Double.parseDouble(s2);
        System.out.println(i1);
        System.out.println(d1);
    }
}
