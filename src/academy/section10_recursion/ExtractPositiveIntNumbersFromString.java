package academy.section10_recursion;

import java.util.Arrays;

public class ExtractPositiveIntNumbersFromString {
    public static void main(String[] args) {
        // read source data
        String string = "Hello 1234 from 23, or java - is not java11!-2.3 is not a 24";
        // processing
        int[] numbers = extractNumbersFromString(string);
        // display results
        System.out.println(Arrays.toString(numbers));
    }

    // 22222222
    // 2,2,2,2
    private static int[] extractNumbersFromString(final String string) {
        int[] results = new int[string.length() / 2 + 1];
        int count = 0;
        StringBuilder numberBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            var ch = string.charAt(i);
            if (isDigit(ch)) {
                numberBuilder.append(ch);
            } else if (numberBuilder.length() > 0) {
                results[count++] = Integer.parseInt(numberBuilder.toString());
                numberBuilder.setLength(0);
            }
        }
        if (numberBuilder.length() > 0) {
            results[count++] = Integer.parseInt(numberBuilder.toString());
        }
        return trimArray(results, count);
    }

    private static boolean isDigit(char ch) {
//        return Character.isDigit(ch);
        return ch >= '0' && ch <= '9';
    }

    private static int[] trimArray(int[] array, int count) {
        int[] result = new int[count];
//        System.arraycopy(array, 0, result, 0, count);
        for (int i = 0; i < count; i++) {
            result[i] = array[i];
        }
        return result;
    }
}
