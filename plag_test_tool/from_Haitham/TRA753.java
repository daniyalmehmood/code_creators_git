public class TRA753{
public static boolean stringE(String str) {
        char[] subStrings = new char[3];
        if (str.length() < 4) {
            return false;
        }
        str.getChars(1, 4, subStrings, 0);
        System.out.println(new String(subStrings));
        if (new String(subStrings).matches("^(?=[^e]*e[^e]*$).*$")) {
            return true;
        } else return false;
    }
	}