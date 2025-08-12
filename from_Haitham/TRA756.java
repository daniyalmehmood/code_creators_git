public class TRA756{
    public static String endUp(String str) {
		if (str.isEmpty()) {
		return "cannot Uppercase empty string";
        } else if (str.length() < 3) {
            return str.toUpperCase();
        } else return str.substring(0, str.length() - 3) + str.substring(str.length() - 3, str.length()).toUpperCase();
    }
	}