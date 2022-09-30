package academy.section08_functions;

public class FunctionsDeclaration {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        double e = 5.6;
        
        int[] array2 = new int[2];
        double[] array1 = new double[100];
        boolean[][][][] array3 = new boolean[0][0][0][0];
        
        function1();
        function2(2);
        function3(a, b);
        function4(true, "Hello", e);
        function5(array2, array1, array3);
    }

    private static void function5(int[] array2, double[] array1, boolean[][][][] array3) {
    }

    private static void function4(boolean a, String hello, double e) {
    }

    private static void function3(int a, int b) {
        
    }

    private static void function2(int a) {
        if(a > 0) {}
    }

    private static void function1() {
        
    }
}
