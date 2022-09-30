package academy.section09_recursion;

import static academy.section08_functions.SumFunctionWithVarArgs.sumOf;

public class SumFrom1To100UsingRecursion {

    public static void main(String[] args) {
        System.out.println(sumOf(1, 0));
        System.out.println(sumOf(10));
    }
    private static int sumOf(int current, int sum) {
        if (current > 10) {
            return sum;
        } else {
            var newSum = sum + current;
            return sumOf(current + 1, newSum);
        }
    }
    private static int sumOf(int value) {
        if (value == 0) {
            return 0;
        } else {
            var prevSum = sumOf(value - 1);
            return value + prevSum;
        }
    }
}
