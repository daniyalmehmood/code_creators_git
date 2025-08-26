public class StringRepeater {
    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder(); // initialize a string builder to store the result
        for (int i = 0; i < count; i++) { //use a for loop to go through the 'word' and repeat it 'count' time
            result.append(word); // add 'word' to final 'result'
            if (i < count - 1) {
                result.append(sep); // add 'sep' to final 'result' 'count -1' times
            }
        }
        return result.toString(); // return the final 'result' after converted to string
    }
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
    }
}
