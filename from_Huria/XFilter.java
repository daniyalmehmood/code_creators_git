public class XFilter {
    public static String removeInnerX(String str) {
        int len = str.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (!(i > 0 && i < (len - 1) && str.substring(i, i + 1).equals("x"))) {
                result.append(str, i, i + 1);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(removeInnerX("xxHxix"));
        System.out.println(removeInnerX("abxxxcd"));
        System.out.println(removeInnerX("xabxxxcdx"));
        System.out.println(removeInnerX("x"));
        System.out.println(removeInnerX("xx"));
        System.out.println(removeInnerX(""));
    }
}