public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.indexOf(prefix, n) != -1;
    }

    public static void main(String[] args) {
        PrefixAgain pa = new PrefixAgain();
        System.out.println(pa.prefixAgain("abXYabc", 1));
        System.out.println(pa.prefixAgain("abXYabc", 2));
        System.out.println(pa.prefixAgain("abXYabc", 3));
    }
}