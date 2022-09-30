package academy.section06_array;
// read source data
// processing
// display results

public class ArrayElementSum {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        // processing
        for (int i = 0; i < array.length; i++) { // for (int j : array)
            sum += array[i];
        }

        // display results
        System.out.println(sum);

    }
}
