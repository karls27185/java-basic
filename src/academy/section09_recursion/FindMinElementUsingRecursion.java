package academy.section09_recursion;

public class FindMinElementUsingRecursion {
    public static void main(String[] args) {
        int[] array = {1, -2, 8, 0, 5};
        System.out.println(findMin(array));
        System.out.println(findMin(array, 1, array[0]));
        System.out.println(findMin(array, 0));
    }

    // Iterative
    private static int findMin(int[] array) {
        var min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Recursion v1
    private static int findMin(int[] array, int i, int min) {
        if (i == array.length) {
            return min;
        } else {
            return findMin(array, i + 1, Math.min(array[i], min));
        }
    }

    // Recursion v1
    private static int findMin(int[] array, int i) {
        if (i == array.length - 1) {
            return array[array.length - 1];
        } else {
            var min = findMin(array, i + 1);
            return Math.min(array[i], min);
        }
    }
}
