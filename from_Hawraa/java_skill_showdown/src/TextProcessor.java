public class TextProcessor {
    //Count Words in a Sentence:
    public static int countWords(String sentence){
        if (sentence == null && sentence.isEmpty()) {
            return 0;
        }
        int numOfWords = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (!Character.isWhitespace(ch) && (i == 0 || Character.isWhitespace(sentence.charAt(i - 1)))) {
                numOfWords++;
            }
        }
        return numOfWords;
    }

    //Replace Specific Words:
    public static String replaceWord(String text, String oldWord, String newWord){
        if (text == null){
            return "";
        }
        return text.replace(oldWord, newWord);
    }

    //Testing:
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        System.out.println("Original sentence: Java is fun and Java is powerful");
        int numOfWords = TextProcessor.countWords(sentence);
        System.out.println("Word count: " + numOfWords);

        String replace = TextProcessor.replaceWord(sentence, "Java", "Programming");
        System.out.println("After replacement: " + replace);
    }
}
