public class CodeCounter {
    // Counts how many times strings like "co-e" appear in input,
    // where the third character can be any letter.
    public static int countCodeOccurrences(String input) {
        int count = 0;
        for (int i = 0; i <= input.length() - 4; i++) {
            String sub = input.substring(i, i + 4);
            // Check if it starts with "co", ends with "e"
            if (sub.startsWith("co") && sub.charAt(3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCodeOccurrences("aaacodebbb"));    
        System.out.println(countCodeOccurrences("codexxcode"));    
        System.out.println(countCodeOccurrences("cozexxcope"));    
    }
}