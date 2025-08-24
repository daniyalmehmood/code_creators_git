
public class TextProcessor {
    public static int countWords(String sentence) {
        if (sentence.equals("")) return 0;
        String[] words = sentence.split(" ");
        return words.length;
    }

    public static String replaceWord(String text, String oldWord, String newWord) {
        return text.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        int wordCount = TextProcessor.countWords(sentence);
        String replaced = TextProcessor.replaceWord(sentence, "Java", "Programming");
        System.out.println("original sentence: " + sentence);
        System.out.println("word count: " + wordCount);
        System.out.println("After replacment: " + replaced);
    }
}
