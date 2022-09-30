package academy.section06_array;

import java.util.Arrays;

public class DisplayArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[5];

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        System.out.println(array1);
        System.out.println(array2);
    }
}
