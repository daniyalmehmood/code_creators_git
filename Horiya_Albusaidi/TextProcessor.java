import java.util.Arrays;

public class TextProcessor {
    public static void main(String[] args) {
        String sentence = "Coding in Java is awesome";
        int wordCount = TextProcessor.countWords(sentence);
        if(wordCount == 0){
            System.out.println("There is no words in the sentence / String is Empty");
        }
        else
        {
            System.out.println("Word count: " + wordCount);
            String replaced = TextProcessor.replaceWord(sentence, "Java", "Python");
            System.out.println("After replacement: "+ replaced);
        }


    }

    public static String replaceWord(String text, String oldWord, String newWord)
    {

        String replaced = "";
        String [] newText = text.split(" ");

            for (int i=0; i<newText.length; i++)
            {
                if(newText[i].equals(oldWord))
                {
                    newText[i] = newWord;
                }

            }
            replaced = String.join(" ", newText);


        return replaced;


    }

    public static int countWords(String sentence) {
        if(sentence.isEmpty())
            return 0;
        return sentence.split(" ").length;
    }

}
