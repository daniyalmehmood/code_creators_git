public class TextProcessor {

    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }

        String[] words = sentence.trim().split("");
        return words.length;
    }



    public static String repWord(String text, String oldWord, String newWord) {
        return text.replace(oldWord, newWord);
    }



    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        int wordCount = countWords(sentence);
        System.out.println("Orig sentence: " + sentence);
        System.out.println("Word count: " + wordCount);

        String replaced = repWord(sentence, "Java", "Programming");
        System.out.println("After rep: " + replaced);
    }
}