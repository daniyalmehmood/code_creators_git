public class XyBalanceChecker {
    public static boolean xyBalanceChecker(String str) {
        int indexOfX = -1;
        int indexOfY = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ('x')) {
                indexOfX = i;
            }
            if (str.charAt(i) == ('y')) {
                indexOfY = i;
            }
        }
        if (indexOfX == indexOfY) return true;
        else return indexOfX < indexOfY;
    }
    public static void main(String[] args) {
        System.out.println(xyBalanceChecker("aaxbby"));
    }
}
