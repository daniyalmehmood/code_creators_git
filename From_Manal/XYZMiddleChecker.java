public class XYZMiddleChecker {
    public static boolean xyzMiddle(String str) {
        int len = str.length();
        int xyzLength = 3;
        // We only check positions where "xyz" can fit
        for (int i = 0; i <= len - xyzLength; i++) {
            if (str.substring(i, i + xyzLength).equals("xyz")) {
                int leftLength = i;
                int rightLength = len - (i + xyzLength);
                // Check if difference between left and right lengths is at most 1
                if (Math.abs(leftLength - rightLength) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));   
        System.out.println(xyzMiddle("AxyzBB"));   
        System.out.println(xyzMiddle("AxyzBBB"));   
    }
}