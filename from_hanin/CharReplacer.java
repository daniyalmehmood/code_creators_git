//
public class CharReplacer {
    public static String replaceXWithY(String str) {
        if (str.length() == 0) {
            return "";
        } else {
            char firstChar = str.charAt(0);
            str = str.substring(1);
            if (firstChar == 'x') {
                return 'y' + replaceXWithY(str);
            } else {
                return firstChar + replaceXWithY(str);
            }
        }
    }

}

