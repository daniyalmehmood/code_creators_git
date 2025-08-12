public class SwapLastChars  {
    public static String swapEndChars(String str) {
        if(str.length() < 2){
            return str;
        }
        char lastCh = str.charAt(str.length() - 2);
        char secCh = str.charAt(str.length() - 1);
        return str.substring(0, str.length() - 2) + secCh + lastCh;
    }

    public static void main(String[] args){
        System.out.println(swapEndChars("coding"));
        System.out.println(swapEndChars("cat"));
        System.out.println(swapEndChars("ab"));
    }
}
