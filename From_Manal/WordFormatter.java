public class WordFormatter {
    public static String insertWordInBrackets(String out, String word) {
        //Extract the first two characters
        String start = out.substring(0, 2);
        //Extract the last two characters
        String end = out.substring(2);

        return start + word + end;
    }
    public static void main (String[] args) {
        System.out.println(insertWordInBrackets("<<>>", "Yay"));
        System.out.println(insertWordInBrackets("<<>>", "WooHoo"));
        System.out.println(insertWordInBrackets("[[]]", "word"));
    }
}