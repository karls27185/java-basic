package academy.section10_recursion;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println(version2());
        System.out.println(version3());
    }

    private static int version2() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        return 0;
    }

    private static int version3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.print("FizzBuzz ");
                } else {
                    System.out.print("Fizz ");
                }
            } else if (i % 5 == 0) {
                System.out.print("Duzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        return 0;
    }
}
