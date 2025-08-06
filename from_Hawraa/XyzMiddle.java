public class XyzMiddle {
    public static boolean isXyzInMiddle(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int leftLength = i;
                int rightLength = str.length() - (i + 3);
                if (Math.abs(leftLength - rightLength) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isXyzInMiddle("AAxyzBB"));
        System.out.println(isXyzInMiddle("AxyzBB"));
        System.out.println(isXyzInMiddle("AxyzBBB"));
    }
}
