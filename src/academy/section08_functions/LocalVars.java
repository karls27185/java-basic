package academy.section08_functions;

public class LocalVars {
    public static void main(String[] args) {
        int a = 2;
        function1();
        function2(a);
    }

    private static void function1(){
        int b = 2;
    }

    private static void function2(int a) {
        int b = 2;
    }
}
