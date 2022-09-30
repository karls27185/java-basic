package academy.section07_String;

import java.util.Scanner;

public class StringCompareTo {
    public static void main(String[] args) {
        String s1 = new Scanner(System.in).nextLine();
        String s2 = new Scanner(System.in).nextLine();

        // s1 > s2 -> s1.compareTo(s2) > 0
        if (s1.compareTo(s2) > 0){
            System.out.println("s1 > s2");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("s1 < s2");
        } else {
            System.out.println("S1 = s2");
        }
    }
}
