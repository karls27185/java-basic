package academy.section05_cycles;

public class ForExamples {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();

        for (int i = 4; i >= 0; i--) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(5 - i + " ");
        }
        System.out.println();

        for (int i = 50; i < 100; i+=5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
