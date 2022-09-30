package academy.section07_String;

public class StringVerificationMethods {
    public static void main(String[] args) {
        String s = "Hello world world!";

        System.out.println("s.contains(\"world\") = " + s.contains("world"));
        System.out.println("s.contains(\"world\") = " + s.contains("World"));

        System.out.println("s.indexOf('o') = " + s.indexOf('o'));
        System.out.println("s.lastIndexOf('o') = " + s.lastIndexOf('o'));

        System.out.println("s.indexOf(\"world\") = " + s.indexOf("world"));
        System.out.println("s.lastIndexOf(\"world\") = " + s.lastIndexOf("world"));

        System.out.println("s.startsWith(\"Hello\") = " + s.startsWith("Hello"));
        System.out.println("s.endsWith(\"world\") = " + s.endsWith("world"));

        System.out.println("s.isEmpty() = " + s.isEmpty());

        System.out.println("".isEmpty());
    }
}
