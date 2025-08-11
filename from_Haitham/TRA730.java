public class TRA730{
public static String front22(String str) {
        if (str.length() == 2) {
            return str + str + str;
        } else if (str.length() > 2) {
            return str.substring(0, 2) + str + str.substring(0, 2);
        } else return "less than valid length of string";
    }
	}