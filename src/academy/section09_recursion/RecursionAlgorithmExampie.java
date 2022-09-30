package academy.section09_recursion;

public class RecursionAlgorithmExampie {
    public static void main(String[] args) {
        printNumbersFrom1to10();
        printNumbersFromAndTo10(1);
    }

    private static void printNumbersFromAndTo10(int i) {
        if (i > 10) {
            System.out.println();
        } else {
            System.out.print(i + "\t");
            printNumbersFromAndTo10(i + 1);
        }

    }

    private static void printNumbersFrom1to10() {
        int i = 1;
        while (true) {
            if (i > 10) {
                System.out.println();
                break;
            }
            System.out.print(i + "\t");
            i++;
        }
    }

//    private static void printNumbersFrom1to10() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i + "\t");
//        }
//        System.out.println();
//    }

}
