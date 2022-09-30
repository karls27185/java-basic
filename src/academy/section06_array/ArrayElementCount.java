package academy.section06_array;
// read source data
// processing
// display results

public class ArrayElementCount {
    public static void main(String[] args) {
        // read source data
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var element = 2;

        // processing
        var count = 0;
        for (int i = 0; i < array.length; i++) { //for (int j : array)
            if (array[i] == element) {
                count++;
            }
        }

        // display results
        System.out.println(count);

    }
}
