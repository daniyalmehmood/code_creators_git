import java.util.ArrayList;
import java.util.Arrays;
   public class Task2{
    public static String replaceWord(String text, String oldWord, String newWord){
        if (text == null){
            return null;

        }
        return text.replace(oldWord,newWord);
    }
       public static int countWords(String sentence) {
           if (sentence == null && sentence.trim().isEmpty()) {
               return 0;
           }

           String[] words = sentence.trim().split(" ");
           return words.length;

       }

    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        int wordCount = countWords(sentence);
        System.out.println(countWords(sentence));
        System.out.println("Original sentence: " + sentence);
        System.out.println("Word count: " + wordCount);
        String replaced = replaceWord(sentence, "Java", "Programming");
        System.out.println("After replacement: " + replaced);


    }
}
