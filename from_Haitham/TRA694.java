public class TRA694{
public static String frontBack(String str) {

        if (str.length() <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        char tempChar = str.charAt(0);
        sb.setCharAt(0, str.charAt(sb.length() - 1));
        sb.setCharAt(sb.length() - 1, tempChar);
        return sb.toString();

    }
}
