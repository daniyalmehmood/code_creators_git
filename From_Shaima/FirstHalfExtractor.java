public class FirstHalfExtractor {
    public static String firstHalfExtractor(String str) {
        int length = str.length();
        int halfLength = length/2;
        StringBuilder newStr = new StringBuilder();
        newStr.append(str,0,halfLength);
        return newStr.toString();
    }
    public static void main(String[] args) {
        System.out.println(firstHalfExtractor("WooHoo"));
    }
}
