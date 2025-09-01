public class StringSimplifier {
    public static String removeTwoChar(String str) {
        if (str.length() < 2) {
            return str;
        }
        //first two characters and  last two characters
        String front = str.substring(0, 2);
        String back = str.substring(str.length() - 2);
        // If front and back match, remove the first two characters
        if (front.equals(back)) {
            return str.substring(2);
        }
        return str;
    }

}
