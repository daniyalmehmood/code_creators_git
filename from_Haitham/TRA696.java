public class TRA696{
public static String backAround(String str) {
        if (str.length() == 1) {
            return str + str + str;

        } else if (str.length() > 1) {
            return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
        } else
            return "empty string";
    }
	}