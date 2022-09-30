package academy.section09_recursion;

public class RecursionAlgorithmExampleVersion2 {
    public static void main(String[] args) {
/*        System.out.println(factorial(5));

    private static int factorial(int value) {
        if (value == 0) {
            return 1;
        } else {
            int prevValue = factorial(value - 1);
            return value * prevValue;
            // return value * factorial(value -1);
        }
    }
 */
        printNumbersFromAndTo10(1);
        printNumbersFrom1AndTo(100);
    }

        private static void printNumbersFrom1AndTo ( int i){
            printNumbersFrom1AndTo(i, i);
        }
        private static void printNumbersFrom1AndTo ( int i, int to){
            if (i != 0) {
                printNumbersFrom1AndTo(i - 1, to);
                System.out.print(i - 1 + "\t");
                if (i == to) {
                    System.out.println();
                }
            }
        }

        private static void printNumbersFromAndTo10 ( int i){
            if (i > 10) {
                System.out.println();
            } else {
                System.out.print(i + "\t");
                printNumbersFromAndTo10(i + 1);
            }
        }

}