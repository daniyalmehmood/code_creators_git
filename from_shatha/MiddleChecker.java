public class MiddleChecker {
    public static boolean isXyzInMiddle(String str) {
        int len = str.length();
        for (int i = 0; i <= len - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int left = i;
                int right = len - (i + 3);
                if (Math.abs(left - right) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main (String[]args){
        System.out.println(isXyzInMiddle("AAxyzBB"));
        System.out.println(isXyzInMiddle("AxyzBB"));
        System.out.println(isXyzInMiddle("AxyzBBB"));
    }}
