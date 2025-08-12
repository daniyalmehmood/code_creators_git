public class PrefixAgain {
    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = n; i <= str.length() - n; i++) {
            String currentSub  = str.substring(i, i + n);
            if (currentSub .equals(prefix)) {
                return true;
            }
        }
        return false;
    }
    public static void main (String[] args){
        System.out.println(prefixAgain("abXYabc", 1));
        System.out.println(prefixAgain("abXYabc", 2));
        System.out.println(prefixAgain("abXYabc", 3));
    }
}
