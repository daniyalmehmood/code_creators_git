public class MakeOutWord {
    public static String makeOutWord(String out, String word) {
        String firstOut = out.substring(0,2);
        String lastOut = out.substring(2,4);
        return firstOut + word + lastOut;
    }

    public static void main(String[] args){
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }
}
