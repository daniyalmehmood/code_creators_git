public class StarRemover {
    public static String starOut(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == '*' || (i > 0 && str.charAt(i - 1) == '*') || (i < str.length() - 1 && str.charAt(i + 1) == '*'))) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));
        System.out.println(starOut("*str*in*gy"));
        System.out.println(starOut("abc"));
        System.out.println(starOut("*"));
    }
}
