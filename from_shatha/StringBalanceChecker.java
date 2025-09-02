public class StringBalanceChecker {
    public static boolean hasEqualIsAndNot(String str) {
        int isCount = 0;
        int notCount = 0;
        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is")) {
                isCount++;
            }
        }
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("not")) {
                notCount++;
            }
        }

        return isCount == notCount;
    }
        public static void main(String arg[]){
            System.out.println(hasEqualIsAndNot("This is not"));
            System.out.println(hasEqualIsAndNot("This is notnot"));
            System.out.println(hasEqualIsAndNot("noisxxnotyynotxisi"));
        }
}
