public class StringMinCat {
    public static void main(String[] args) {
        System.out.println(concatShorterStrings("Hello", "Hi")); //loHi
        System.out.println(concatShorterStrings("Hello", "java")); //ellojava
        System.out.println(concatShorterStrings("java", "Hello")); //javaello
    }
    public static String concatShorterStrings(String a, String b) {
        int diffLen = Math.min(a.length(), b.length());
        if(a.length() > b.length()){
            return a.substring(a.length()-diffLen) + b.substring(0);
        } else if (b.length() > a.length()) {
            return a.substring(0) + b.substring(b.length()-diffLen);
        }
        return a + b;
    }
}
