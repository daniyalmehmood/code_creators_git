public class IsPrefixRepeated {
    public static boolean isPrefixRepeated(String str, int n) {
        String prefix = str.substring(0, n);
        if (str.indexOf(prefix, n) > 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        System.out.println(isPrefixRepeated("abXYabc", 1));
        System.out.println(isPrefixRepeated("abXYabc", 2));
        System.out.println(isPrefixRepeated("abXYabc", 3));
        System.out.println(isPrefixRepeated("a", 1));
        System.out.println(isPrefixRepeated("aa", 1));
    }
}