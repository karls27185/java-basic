package academy.section06_array;

// read source data
// processing
// display results
public class CheckIfAllNumbersArePositive {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 2, 3, -4, 5};
        // processing
        var positive = true;
        for (int i : array) {
            if (i < 0) {
                positive = false;//System.out.println("Not all positive");
                break;
            }
        }
        // display results
        System.out.println(positive ? "All positive" : "Not all positive");
    }
}
