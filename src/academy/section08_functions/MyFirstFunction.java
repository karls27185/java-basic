package academy.section08_functions;

public class MyFirstFunction {
    public static void main(String[] args) {
        // read source data
        int a = 2;
        int b = 3;

        // processing
        int res = multiply(a, b);

        // display results
        System.out.println(res);
    }

    private static int multiply(int a, int b) {
        return a * b;
    }
}
