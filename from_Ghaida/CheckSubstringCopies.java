public class CheckSubstringCopies {//Recursion-1 > strCopies
    public static void main(String[] args) {
        System.out.println(hasAtLeastNCopies("catcowcat", "cat", 2));// → true
        System.out.println(hasAtLeastNCopies("catcowcat", "cow", 2));// → false
        System.out.println(hasAtLeastNCopies("catcowcat", "cow", 1));// → true
    }

    public static boolean hasAtLeastNCopies(String str, String sub, int n) {
        if (n <= 0) {
            return true;
        }
        else if (str.length() < sub.length()) {
            return false;
        }
        else if (str.startsWith(sub)) {
            return hasAtLeastNCopies(str.substring(1), sub, n - 1);
        }
        return hasAtLeastNCopies(str.substring(1), sub, n);
    }
}
