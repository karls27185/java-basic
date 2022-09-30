package academy.section08_functions;

public class ArrayElementCountUsingFunction {
    public static void main(String[] args) {
        // read source data
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var element = 2;

        // processing
        int count = getCount(array, element);

        // display results
        System.out.println(count);
    }

    private static int getCount(int[] array, int element) {
        var count = 0;
        for (int value : array) {
            if (value == element) {
                count++;
            }
        }
        return count;
    }
}
