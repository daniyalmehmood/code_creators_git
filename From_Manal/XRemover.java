public class XRemover {
    //the function removes X from the first two characters
    public static String removeXFromStart(String str) {
        int len = str.length();
        if (len >= 2) {
            String first = str.substring(0, 1);
            String second = str.substring(1, 2);
            String rest = str.substring(2);

            if (first.equals("x")) first = "";
            if (second.equals("x")) second = "";
            return first + second + rest;
        }

        if (len == 1) {
            if (str.substring(0, 1).equals("x"))
                return "";
            else return str;
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(removeXFromStart("xHi"));
        System.out.println(removeXFromStart("Hxi"));
        System.out.println(removeXFromStart("Hi"));
    }
}