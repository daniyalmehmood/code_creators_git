import java.awt.*;

public class NotString {
    public static String notString(String str) {
        String substring;
        String modifiedString = "";
        String convertStringToUpperCase = "";
        if (str.length() >= 3) {
            substring = str.substring(0, 3);
            convertStringToUpperCase=substring.toUpperCase();
            modifiedString=convertStringToUpperCase.equals("NOT")?str:"Not " + str;

        } else return "Not " + str;

        return modifiedString;
    }
}
