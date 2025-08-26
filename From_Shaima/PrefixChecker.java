public class PrefixChecker {
    public static boolean doesPrefixAppearAgain(String str, int n) {
    String prefix = str.substring(0,n);
    if (str.indexOf(prefix,n)>0){
        return true;
    }
    return false;
    }
    public static void main(String[] args) {
        System.out.println(doesPrefixAppearAgain("abxxabc", 1));
        System.out.println(doesPrefixAppearAgain("abxxabc", 1));
        System.out.println(doesPrefixAppearAgain("abxxabc", 1));
    }
}
