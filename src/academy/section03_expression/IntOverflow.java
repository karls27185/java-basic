package academy.section03_expression;

import java.math.BigInteger;

public class IntOverflow {
    public static void main(String[] args) {
        {
            var i = Integer.MAX_VALUE;
            System.out.println(i);
            System.out.println(i + 1);
        }
        {
            var i = Integer.MIN_VALUE;
            System.out.println(i);
            System.out.println(i - 1);
        }
        System.out.println(1);
        System.out.println(1 * 2);
        System.out.println(1 * 2 * 3);
        System.out.println(1 * 2 * 3 * 4);
        System.out.println(1 * 2 * 3 * 4 * 5);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12);
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13);

        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 2);

        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14);

        long g; //8 byte
        BigInteger b = new BigInteger("");//Infinite size

    }
}
