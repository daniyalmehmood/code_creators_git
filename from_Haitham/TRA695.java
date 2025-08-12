public class TRA695{
public static String front3(String str) {
        if (str.length() <= 2) {
            return str+str+str;
        }
        return (str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3));
    }
	}