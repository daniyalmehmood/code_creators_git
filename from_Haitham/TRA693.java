public class TRA693{
public static String missingChar(String str, int n) {
        if (str.equals("")) {
            return "the input string is empty";
        } else if (n < 0 || n >= str.length()) {
            return "invalid index";
        }
        StringBuilder sb = new StringBuilder(str);
        return (sb.deleteCharAt(n)).toString();

    }
}
