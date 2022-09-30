package academy.section08_functions;

public class ArrayElementSumUsingFunction {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 2, 3, 4, 5};

        // processing
        int sum = getSum(array);

        // display results
        System.out.println(sum);
    }

    private static int getSum(int[] array) {
        var sum = 0;
        for (int value : array) {
            sum += value; // sum = sum + value;
        }
        return sum;
    }
}
