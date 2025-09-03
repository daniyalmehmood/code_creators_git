public class LastTwoCharSwapper {
    public static String swapLastTwoChars(String str) {
        if (str.length() < 2) {
            return str;
        }
        //Extract all but the last two chars
        String front = str.substring(0, str.length() - 2);
        //extract the last two chars
        String second = str.substring(str.length() - 2, str.length() - 1);
        String last = str.substring(str.length() - 1);
        return front + last + second;
    }
    public static void main(String[] args) {
        System.out.println(swapLastTwoChars("coding"));
        System.out.println(swapLastTwoChars("cat") );
        System.out.println(swapLastTwoChars("ab"));
    }
}
