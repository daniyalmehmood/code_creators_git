public class StringTrimmer {
    public String removeFirstAndLastChar(String str) {

        if (str.length() >= 3) {
            return str.substring(1, str.length() - 1);

        }
        return "";

    }
}