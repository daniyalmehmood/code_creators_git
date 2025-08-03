public class StringTrimmer {


 //Returns a version of the input string without the first and last characters.

    public String removeFirstAndLastChar(String str) {
        if (str.length() <= 2) {
            return "";
        }

        return str.substring(1, str.length() - 1);
    }
}
