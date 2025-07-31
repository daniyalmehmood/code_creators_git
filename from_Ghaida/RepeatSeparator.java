public class RepeatSeparator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3)); //"WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2)); //"ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1)); //"This"
    }
    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder newString = new StringBuilder(word);
        if(count <= 0){
            return "";
        }
        for (int i = 1; i < count; i++) {
            newString.append(sep).append(word);
        }
        return newString.toString();
    }
}
