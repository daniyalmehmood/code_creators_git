public class PrefixChecker {
    // Returns true if the prefix of length n appears again later in the string
    public static boolean isPrefixRepeated(String str, int n) {
        String prefix = str.substring(0, n);
        return str.indexOf(prefix, n) != -1;
    }
    public static void main(String[] args) {
        System.out.println(isPrefixRepeated("abXYabc", 1));
        System.out.println(isPrefixRepeated("abXYabc", 2));
        System.out.println(isPrefixRepeated("abXYabc", 3));
    }
}