public class MakeOutWord {

    public static String makeOutWord(String out, String word) {

        String start = out.substring(0, 2);

        String end = out.substring(2, 4);

        return start + word + end;
    }

    public static void main(String[] args) {
        System.out.println(makeOutWord("[[]]","yay"));
    }

}
