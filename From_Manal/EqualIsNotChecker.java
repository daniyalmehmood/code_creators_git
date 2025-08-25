public class EqualIsNotChecker {
    // Method to check if count of "is" equals count of "not"
    public static boolean hasEqualIsAndNot(String text) {
        int isCount = 0;
        int notCount = 0;
        for (int i = 0; i <= text.length() - 2; i++) {
            if (text.substring(i, i + 2).equals("is")) {
                isCount++;
            }
        }
        for (int i = 0; i <= text.length() - 3; i++) {
            if (text.substring(i, i + 3).equals("not")) {
                notCount++;
            }
        }

        return isCount == notCount;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualIsAndNot("This is not"));      
        System.out.println(hasEqualIsAndNot("This is notnot"));  
        System.out.println(hasEqualIsAndNot("noisxxnotyynotxisi"));
    }
}