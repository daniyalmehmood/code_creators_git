public class WordEndCounter {
    // Method to count words ending with 'y' or 'z'
    public static int countWordsEndingWithYorZ(String text) {
        int count = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Check if current character is 'y' or 'z'
            if (currentChar == 'y' || currentChar == 'z') {
                if (i == text.length() - 1 || !Character.isLetter(text.charAt(i + 1))) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countWordsEndingWithYorZ("fez day"));
        System.out.println(countWordsEndingWithYorZ("day fez"));
        System.out.println(countWordsEndingWithYorZ("day fyyyz"));
        System.out.println(countWordsEndingWithYorZ("yellow crazy"));
    }
}