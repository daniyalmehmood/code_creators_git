public class TRA692{
public static String notString(String str) {
        if (str.equals("not " + str.substring(4))) {
            return str;
        }
        return "not " + str;
    }
}
