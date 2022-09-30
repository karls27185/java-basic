package academy.section06_array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] source = {1, -2, 3, -4, 5};

        int[] destination = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
            System.out.println(Arrays.toString(destination));
            //System.arraycopy(source, 0, destination, 0, source.length);
        }

        System.out.println("______________________");
        System.out.println(Arrays.toString(destination));
    }
}
