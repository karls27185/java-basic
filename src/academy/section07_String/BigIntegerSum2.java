package academy.section07_String;

import java.math.BigInteger;

public class BigIntegerSum2 {
    public static void main(String[] args) {
        // read source data
        var a = "123456789012345678901234567890123456789012345678901234567890";
        var b = "12345678901234567890123456789012345678901234567890";

        // processing
        StringBuilder result = new StringBuilder();
        int firstLength = a.length();
        int secondLength = b.length();
        var maxLength = firstLength > secondLength ? firstLength : secondLength;

        int prevDigit = 0;
        for (int i = 0; i < maxLength; i++) {
            int digit1;
            if (firstLength - i - 1 >= 0) {
                digit1 = Integer.parseInt(String.valueOf(a.charAt(firstLength - i - 1)));
            } else {
                digit1 = 0;
            }

            int digit2;
            if (secondLength - i -1 >= 0) {
                digit2 = Integer.parseInt(String.valueOf(b.charAt(secondLength - i -1)));
            } else {
                digit2 = 0;
            }

            int sum = prevDigit + digit1 + digit2;
            if (sum > 9) {
                prevDigit = 1;
                sum = sum % 10;
            } else {
                prevDigit = 0;
            }
            result.insert(0, sum);
        }
        if (prevDigit != 0) {
            result.insert(0, prevDigit);
        }

        // display results

        System.out.println("a + b = " + result);
        System.out.println("a + b = " + new BigInteger(a).add(new BigInteger(b)));
    }
}
