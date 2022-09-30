package academy.section06_array;

import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        int[] array = {1, 2, 67};
        System.out.println(Arrays.toString(array));

        System.out.println(array.length);
        System.out.println(array[array.length - 1]);
    }
}
