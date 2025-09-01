public class XYZMiddleChecker {
    public static boolean isXYZInMiddle(String str) {
        int length = str.length() / 2;
        for (int i = 0; i < str.length() - 2; i++) {
            // Check for "xyz"
            if (str.substring(length - 1, length + 2).equals("xyz")) {


                return true;
            }
        }
        return false;
    }

}
