public class SubInStrCounter {//Recursion-1 > strCount
    public static void main(String[] args) {
        System.out.println(countSubMatches("catcowcat", "cat"));// → 2
        System.out.println(countSubMatches("catcowcat", "cow"));// → 1
        System.out.println(countSubMatches("catcowcat", "dog"));// → 0
    }

    public static int countSubMatches(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.startsWith(sub)) {
            return 1 + countSubMatches(str.substring(sub.length()), sub);
        }
        return countSubMatches(str.substring(1), sub);
    }
}