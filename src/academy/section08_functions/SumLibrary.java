package academy.section08_functions;

public class SumLibrary {
    public static void main(String[] args) {
        System.out.println(sumOf((short)1, (short)2));
        System.out.println(sumOf(1, 2));
        System.out.println(sumOf(1l, 2l));
        System.out.println(sumOf(1.f, 2.f));
        System.out.println(sumOf(1., 2.));
    }

    private static short sumOf(short a, short b) {
        return (short) (a + b);
    }
    private static int sumOf(int a, int b) {
        return a + b;
    }
    private static long sumOf(long a, long b) {
        return a + b;
    }
    private static float sumOf(float a, float b) {
        return a + b;
    }
    private static double sumOf(double a, double b) {
        return a + b;
    }
}
