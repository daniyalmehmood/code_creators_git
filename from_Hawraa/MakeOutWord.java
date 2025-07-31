public class MakeOutWord {
    public static String makeOutWord(String out, String word) {
        String fOut = out.substring(0,2);
        String lOut = out.substring(2,4);
        return fOut + word + lOut;
    }

    public static void main(String[] args){
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }
}
