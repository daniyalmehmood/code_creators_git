public class NotString {

    public static String checkNotString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equalsIgnoreCase("not")) {
            return str;
        } else {
            return "Not " + str;
        }
    }
}
