package academy.section03_structure;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Enter 'a'");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Enter 'b'");
        var b = new Scanner(System.in).nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println();

        var i1 = (a + b);
        var i2 = (a - b);
        var i3 = (a * b);
        var i4 = (a / b);
        var i5 = (a % b);
        System.out.println("a + b = " + i1);
        System.out.println("a - b = " + i2);
        System.out.println("a * b = " + i3);
        System.out.println("a / b = " + i4);
        System.out.println("a % b = " + i5);
    }
}
