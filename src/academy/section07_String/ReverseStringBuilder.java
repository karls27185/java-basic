package academy.section07_String;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        /*
        StringBuilder res = new StringBuilder();
        res.append("Hello world!");
        res.reverse();
        System.out.println(res);
         */
        String s = "Hello world!";

        StringBuilder builder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }

        /*
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            builder.insert(0, s.charAt(i));
        }
        */

        /*
        StringBuilder builder = new StringBuilder();
        builder.append(s).reverse();
        */

        System.out.println(builder.toString());
    }
}
