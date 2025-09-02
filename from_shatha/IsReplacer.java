public class IsReplacer {
    public static String replaceIsWithIsNot(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                boolean beforeLetter = (i > 0) && Character.isLetter(str.charAt(i - 1));
                boolean afterLetter = (i + 2 < str.length()) && Character.isLetter(str.charAt(i + 2));

                if (!beforeLetter && !afterLetter) {
                    result.append("is not");
                    i += 2;
                    continue;
                }
            }
            result.append(str.charAt(i));
            i++;
        }

        return result.toString();
    }
    public static void main(String arg[]){
        System.out.println(replaceIsWithIsNot("is test"));
        System.out.println(replaceIsWithIsNot("is-is"));
        System.out.println(replaceIsWithIsNot("This is right"));
    }
}
