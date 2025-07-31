public class MakeOutWord {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));//"<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));// → "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word"));// → "[[word]]"
    }
    public static String makeOutWord(String out, String word) {
        String out1part = out.substring(0, 2);
        String out2part = out.substring(2, out.length());
        return out1part + word + out2part;
    }
}
