public class EqualIsNot {
    public static boolean isNotEqualIs(String str) {
        int isCount = 0;
        int notCount = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("is")) {
                isCount++;
            }
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("not")) {
                notCount++;
            }
        }
        return isCount == notCount;
    }
    public static void main(String[] args){
        System.out.println(isNotEqualIs("This is not"));
        System.out.println(isNotEqualIs("This is notnot"));
        System.out.println(isNotEqualIs("noisxxnotyynotxisi"));
    }
}
