package academy.section10_recursion;

public class SimplestTextArchiverVersion2 {

    public static void main(String[] args) {
        // read source data
        String source = "A".repeat(8) + "B".repeat(3) + "C".repeat(5);
        System.out.println("Source text:   " + source);

        // processing
        String zipped = zip(source);
        // display results
        System.out.println("Zipped text:   " + zipped);

        // processing
        String unzipped = unzip(zipped);
        // display results
        System.out.println("Unzipped text: " + unzipped);
    }

    private static String zip(String source) {
        StringBuilder result = new StringBuilder();
        char prev = source.charAt(0);
        int count = 1;
        for (int i = 1; i < source.length(); i++) {
            var current = source.charAt(i);
            if (current == prev) {
                count++;
            } else {
                result.append(prev).append(count);
                prev = current;
                count = 1;
            }
        }
        result.append(prev).append(count);
        return result.toString();
    }

    private static String unzip(String zipped) {
        StringBuilder result = new StringBuilder();
        char ch = zipped.charAt(0);
        StringBuilder countBuilder = new StringBuilder();
        for (int i = 1; i < zipped.length(); i ++) {
            var current = zipped.charAt(i);
            if(isDigit(current)) {
                countBuilder.append(current);
            } else {
                unzipChar(countBuilder, result, ch);
                countBuilder.setLength(0);
                ch= current;
            }
        }
        unzipChar(countBuilder, result, ch);
        return result.toString();
    }

    private static void unzipChar(StringBuilder countBuilder, StringBuilder result, char ch) {
        int count = Integer.parseInt(countBuilder.toString());
        for (int j = 0; j < count; j++) {
            result.append(ch);
        }
    }

    private static boolean isDigit(char ch) {
//        return Character.isDigit(ch);
        return ch >= '0' && ch <= '9';
    }
}
