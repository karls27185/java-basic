package academy.section06_array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var query = 9;

        var index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == query) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
