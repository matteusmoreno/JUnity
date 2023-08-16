package domain;

public class StringUtils {
    public static String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return new StringBuilder(str).reverse().toString();
    }
}

