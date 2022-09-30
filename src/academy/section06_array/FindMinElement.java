package academy.section06_array;
// read source data
// processing
// display results

public class FindMinElement {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, -2, 8, 0, 5};

        // processing
        var min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }

        var max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }


            // display results
        System.out.println(min);
        System.out.println(max);
    }
}
