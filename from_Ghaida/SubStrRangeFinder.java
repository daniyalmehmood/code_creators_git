public class SubStrRangeFinder {//Recursion-1 > strDist
    public static void main(String[] args) {
        System.out.println(findSubMatchLength("catcowcat", "cat"));// → 9
        System.out.println(findSubMatchLength("catcowcat", "cow"));// → 3
        System.out.println(findSubMatchLength("cccatcowcatxx", "cat"));// → 9
    }
    public static int findSubMatchLength(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        else if (!str.startsWith(sub)) {
            return findSubMatchLength(str.substring(1), sub);
        }
        else if (!str.endsWith(sub)) {
            return findSubMatchLength(str.substring(0, str.length() - 1), sub);
        }
        return str.length();
    }
}