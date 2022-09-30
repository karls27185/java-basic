package academy.section09_recursion;

public class RecursionImportantRule {
    public static void main(String[] args) {
        function1(100000);
        System.out.println("a");
    }

    private static void function1(int count) {
        if (count > 0) {
            System.out.println(count);
            function1(count -1);
        }
        //System.out.println("b");
    }
}
