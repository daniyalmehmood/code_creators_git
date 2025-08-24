//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class TextProcessor {

    public static int countWords(String sentence)
        //checking if there is a sentence:
        if(sentence==null || sentence.trim().isEmpty())return 0;
        String words[]=sentence.trim().split("\\s+") return words.length;







    String sentence = "Java is fun and Java is powerful";
    private Object TextProcessor;
    int countw= TextProcessor.countWords(sentence);

}*/

public class TextProcessor {

    public static int count(String sentence) {
        //checking if there is a sentence:
        if (sentence == null || sentence.trim().isEmpty())return 0;

        // Counting the words in the sentence
        String words[] = sentence.trim().split(" "); return words.length;
    }

    // Replacing the words
    public static String replace(String text, String oldW, String newW) {
        // checking if there is a change
        if (text == null || oldW == null || newW == null) return text;

        // replacing the words
        return text.replace(oldW, newW);
    }

    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        // counting
        int wordCount = count(sentence);
        System.out.println("original sentence: " + sentence);
        System.out.println("word count: " + wordCount);
        // replacing words
        String newS = replace(sentence, "Java", "Programming");
                           //(where,  "old word","new word")
        //new sentence
        System.out.println("After replacement: " + newS);

    }
}
