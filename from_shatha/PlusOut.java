public class PlusOut {
    public static String maskExceptWord(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            if (str.startsWith(word, i)) {
                result.append(word);
                i += word.length();
            } else {
                result.append("+");
                i++;
            }
        }
        return result.toString();
    }
    public static void main (String[]args){
        System.out.println(maskExceptWord("12xy34", "xy"));
        System.out.println(maskExceptWord("12xy34", "1"));
        System.out.println(maskExceptWord("12xy34xyabcxy", "xy"));
    }
}
