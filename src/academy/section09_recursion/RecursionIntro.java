package academy.section09_recursion;

public class RecursionIntro {
    public static void main(String[] args) {
        function1();
    }

    private static void function1() {
        function2();
    }

    private static void function2() {
        function3();
    }

    private static void function3() {
        function1();
    }
}
