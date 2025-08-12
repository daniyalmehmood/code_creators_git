public class StarOut {
    public static String deleteLeftRightStar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            boolean leftStar = (i > 0 && str.charAt(i - 1) == '*');
            boolean rightStar = (i < str.length() - 1 && str.charAt(i + 1) == '*');
            if (str.charAt(i) != '*' && !leftStar && !rightStar) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(deleteLeftRightStar("ab*cd"));
        System.out.println(deleteLeftRightStar("ab**cd"));
        System.out.println(deleteLeftRightStar("sm*eilly"));
    }
}
