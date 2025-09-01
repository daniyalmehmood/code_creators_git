public class StringSearcher {
    public static boolean prefixAppearsAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.indexOf(prefix, n) != -1;
    }
    public static void main (String[]args){
        System.out.println(prefixAppearsAgain("abXYabc", 1));
        System.out.println(prefixAppearsAgain("abXYabc", 2) );
        System.out.println(prefixAppearsAgain("abXYabc", 3));
    }
}
