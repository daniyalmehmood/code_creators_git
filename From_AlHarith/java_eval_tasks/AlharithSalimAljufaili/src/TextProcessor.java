public class TextProcessor {

    public static int countWords(String sentence) {
        if (sentence == null) return 0;
        sentence = sentence.trim();
        if (sentence.isEmpty()) return 0;

        String[] parts = sentence.split(" ");
        return parts.length;
    }

    public static String replaceWord(String text, String oldWord, String newWord) {
        if (text == null || oldWord == null || oldWord.isEmpty()) return text;
        return text.replace(oldWord, newWord);
    }


    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        int wordCount = countWords(sentence);
        String replaced = replaceWord(sentence, "Java", "Programming");
        System.out.println("Original sentence: " + sentence);
        System.out.println("Word count: " + wordCount);
        System.out.println("After replacement: " + replaced);
    }
}
