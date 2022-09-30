package academy.section08_functions;

public class ArrayElementStatisticWithModification {
    public static void main(String[] args) {
        // read source data
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};

        // processing
        int[] unique = new int[array.length];
        int[] counts = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            var element = array[i];

            var exists = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == element) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                var numbers = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (element == array[j]) {
                        numbers++;
                    }
                }
                unique[count] = element;
                counts[count] = numbers;
                count++;
            }
        }
        int[][] result = new int[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = unique[i];
            result[i][1] = counts[i];
        }

        // display results
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " = " + ((double) result[i][1] * 100 / array.length) + " %");
        }
    }
}
