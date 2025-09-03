public class RepeatSeparator {

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(word);
            // Append separator if not the last occurrence
            if (i < count - 1) {
                result.append(sep);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));    
        System.out.println(repeatSeparator("This", "And", 2)); 
        System.out.println(repeatSeparator("This", "And", 1));  
    }
}