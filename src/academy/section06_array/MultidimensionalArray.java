package academy.section06_array;

import java.util.Arrays;

// read source data
// processing
// display results
public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] array1 = new int[3][4];
        int[][] array2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(array2[2][1]);

        System.out.println("array1");
        for (int[] row1 : array1) {
            System.out.println(Arrays.toString(row1));
        }
        System.out.println();
        System.out.println("array2");
        for (int[] row2 : array2) {
            System.out.println(Arrays.toString(row2));
        }
    }
}
