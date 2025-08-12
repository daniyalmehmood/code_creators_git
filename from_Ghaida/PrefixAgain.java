public class PrefixAgain {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 1)); //true
        System.out.println(prefixAgain("abXYabc", 2)); //true
        System.out.println(prefixAgain("abXYabc", 3)); //false
    }
    public static boolean prefixAgain(String str, int n) {
        if(str != ""){
            for (int i = n; i <= str.length() - n; i++) {
                if (str.substring(i, i + n).equals(str.substring(0, n))){
                    return true;
                }
            }
        }
        return false;
    }
}
