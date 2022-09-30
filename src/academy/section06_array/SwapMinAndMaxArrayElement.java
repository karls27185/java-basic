package academy.section06_array;

import java.util.Arrays;

// read source data
// processing
// display results
public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, -2, 3, 8, 5};

        // processing
        var indexOfMinElement = 0;
        var minValue = array[0];
        var indexOfMaxElement = 0;
        var maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            var current = array[i];
            if(current < minValue){
                minValue = current;
                indexOfMinElement = i;

            }
            if(current > maxValue) {
                maxValue = current;
                indexOfMaxElement = i;

            }
        }
        var temp = array[indexOfMaxElement];
        array[indexOfMaxElement] = array[indexOfMinElement];
        array[indexOfMinElement] = temp;

        // display results
//        System.out.println("MaxElement = " + array[indexOfMinElement]);
//        System.out.println("MinElement = " + array[indexOfMaxElement]);
        System.out.println(Arrays.toString(array));
    }
}
