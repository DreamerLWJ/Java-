package Day1;

import java.io.IOException;

public class InputDemo1Im {
    public static void main(String[] args) throws IOException {
        System.out.print("enter:");

        int i = System.in.read();

        System.out.println("output:");

        while (i != -1) {
            System.out.print((char) i);
            i = System.in.read();
        }
    }
}
