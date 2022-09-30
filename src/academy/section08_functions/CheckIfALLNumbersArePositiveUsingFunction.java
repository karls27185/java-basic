package academy.section08_functions;

public class CheckIfALLNumbersArePositiveUsingFunction {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 2, 3, 4, 5};

        // processing
        boolean allPositive = isAllPositive(array);

        // display result
        System.out.println(allPositive ? "All positive" : "Not all positive");
    }

    private static boolean isAllPositive(int[] array) {
        var allPositive = true;
        for (int value : array) {
            if (value < 0) {
                allPositive = false;
                break;
            }
        }
        return allPositive;
    }
}
