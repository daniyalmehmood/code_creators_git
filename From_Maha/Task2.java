import java.util.SortedMap;

public class Task2 {
    public static void main(String[] args) {
        String sentence="Java is fun and Java is powerful" ;
       int wordCount=countWords(sentence);
        System.out.println("Original sentence :" + sentence);
        System.out.println("Word Count :" + wordCount);
      String result=  replaceWord("Java is fun and Java is powerful", "Java" ,"Programming");
        System.out.println("After replacement: " + result);



    }
    public static int countWords(String sentence){
       int count =0;
        if (sentence.isEmpty()) {
            return 0;
        }
       for (int i=0; i<sentence.length();i ++){
           if (sentence.charAt(i) == ' '){
               count++;
           }
       }
       return count+1;

    }
    public static String replaceWord(String sentence, String oldWord, String newWord){
       return sentence.replace(oldWord,newWord);

             }
         }



