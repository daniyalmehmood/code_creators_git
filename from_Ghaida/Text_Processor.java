public class Text_Processor {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        System.out.println("Original sentence: " + sentence);
        int wordCount = Text_Processor.countWords(sentence);
        System.out.println("Word count: " + wordCount); // Should print 5

        String replaced = Text_Processor.replaceWord(sentence, "Java", "Programming");
        System.out.println("After replacement: " + replaced); // Should print "Programming is fun and Programming is powerful"
    }

    public static int countWords(String sentence){
        if (sentence == " ") {
            return 0;
        }
        int wordCountInSentence = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                if(i == sentence.length() - 1 || sentence.charAt(i + 1) == ' '){
                    wordCountInSentence++;
                }
            }
        }
        return wordCountInSentence;
    }
    public static String replaceWord(String text, String oldWord, String newWord){
        return text.replace(oldWord, newWord);
    }
}
