package academy.section09_recursion;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int value) {
        if (value == 0) {
            return 1;
        } else {
            return value * factorial(value -1);
        }
    }
}
