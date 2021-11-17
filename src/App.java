import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    private static int DIGITS = 3;

    private static String COMMA = ",";
    private static String MINUS = "-";

    public static void main(String[] args) {
        System.out.println(commaSeparatedString(123));
        System.out.println(commaSeparatedString(12345));
        System.out.println(commaSeparatedString(1234567));
        System.out.println(commaSeparatedString(-1234567));
        System.out.println(commaSeparatedString(123456789));
        System.out.println(commaSeparatedString(-123456789));
    }

    private static String commaSeparatedString(int input) {
        boolean isNegative = false;
        if (isNegative(input)) {
            input *= -1;
            isNegative = true;
        }
        String str = String.valueOf(input);
        String[] split = str.split("");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            if (isSeparate(i)) {
                result.add(COMMA);
            }
            result.add(split[(split.length - 1) - i]);
        }
        if (isNegative) {
            result.add(MINUS);
        }
        Collections.reverse(result);
        StringBuilder output = new StringBuilder();
        for (String string : result) {
            output.append(string);
        }
        return output.toString();
    }

    private static boolean isSeparate(int count) {
        if (count != 0) {
            return count % DIGITS == 0;
        }
        return false;
    }

    private static boolean isNegative(int a) {
        return a < 0;
    }
}
