public class MakeTags {
    public static String makeOutWord(String out, String word) {
        String first=out.substring(0, 2);
        String last =out.substring(2);
        return first+word+last;
    }

public static void main(String[] args) {
    System.out.println(makeOutWord("<<>>", "Yay"));
    System.out.println(makeOutWord("<<>>", "WooHoo"));
    System.out.println(makeOutWord("[[]]", "word"));
}
}