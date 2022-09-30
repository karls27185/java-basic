package academy.section06_array;

import java.util.Arrays;

public class ArrayCopyRange {
    public static void main(String[] args) {
        // read source data
        int[] source = {1, -2, 3, -4, 5};
        int startIndex = 1;
        int endIndex = 3;

        // processing
        int[] destination = new int[endIndex - startIndex];
        for (int i = 0; i < destination.length; i++) {
            destination[i] = source[i + startIndex];
        }
        //System.arraycopy(source, startIndex, destination, 0, destination.length);

        // display results
        System.out.println(Arrays.toString(destination));
    }
}
