public class starOut {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd")); //"ad"
        System.out.println(starOut("ab**cd")); //"ad"
        System.out.println(starOut("sm*eilly")); //"silly"
    }
    public static String starOut(String str) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == '*' || (i > 0 && str.charAt(i - 1) == '*') || (i < str.length() - 1 && str.charAt(i + 1) == '*'))) {
                newString.append(str.charAt(i));
            }
        }
        return newString.toString();
    }
}
