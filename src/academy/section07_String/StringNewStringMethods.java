package academy.section07_String;

import java.util.Arrays;

public class StringNewStringMethods {
    public static void main(String[] args) {
        String s = " Hello world ";

        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.toLowerCase() = " + s.toLowerCase());

        System.out.println("s.repeat(2)" + s.repeat(2));

        s = s.repeat(2);

        System.out.println("s.replace('l','j') = " + s.replace('l','j'));
        System.out.println("s.replace('l','j') = " + s.replace("Hello","Bay"));

        System.out.println("s.substring(6) = " + s.substring(6));
        System.out.println("s.substring(6) = " + s.substring(0, 6));

        System.out.println("Arrays.toString(s.split(\" \")) = " + Arrays.toString(s.split(" ")));

        System.out.println("s.trim() = " + s.trim());
        System.out.println("s.strip() = " + s.strip());
    }
}
