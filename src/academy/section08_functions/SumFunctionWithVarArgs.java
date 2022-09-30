package academy.section08_functions;

public class SumFunctionWithVarArgs {

    public static void main(String[] args) {
        System.out.println(sumOf());
        System.out.println(sumOf(1));
        System.out.println(sumOf(1, 2));
        System.out.println(sumOf(1, 2, 3));
    }

    public static int sumOf(int... args) {
        var sum = 0;
        for (int arg: args) {
            sum += arg;
    }
        return sum;
    }
}
