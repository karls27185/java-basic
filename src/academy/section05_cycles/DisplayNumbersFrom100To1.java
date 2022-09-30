package academy.section05_cycles;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {
        var from = 100;
        var to = 79;
        var step = 1;

        for (int i = from; i >= to; i-=step) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("End");
    }
}
