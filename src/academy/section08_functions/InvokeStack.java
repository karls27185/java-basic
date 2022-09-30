package academy.section08_functions;

public class InvokeStack {

    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        function1(a, b);
        function2(a, b);
    }

    private static void function1(int a, int c) {
        int b = 0;
        function2(a, c);
    }

    private static void function2(int a, int b) {
        System.out.println(a / b);
    }
}
