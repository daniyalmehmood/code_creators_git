public class CutEndsSafe {
    public static String cutEndsSafe(String str) {
        if (str.length() > 1) {
            StringBuilder result = new StringBuilder();
            result.append(str, 1, str.length() - 1);
            return result.toString();
        }
        return "";
    }

    public static void main(String[] args) {

        System.out.println(cutEndsSafe("Hello"));
        System.out.println(cutEndsSafe("abc"));
        System.out.println(cutEndsSafe("ab"));
        System.out.println(cutEndsSafe("a"));
        System.out.println(cutEndsSafe(""));
        System.out.println(cutEndsSafe("coldy"));
        System.out.println(cutEndsSafe("java code"));

    }
}

