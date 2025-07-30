public class TextProcessor {

    public static int countWords(String sentence){
        if(sentence.isEmpty()){
            return 0;
        }
        else{
            String [] words=sentence.split("\\s+");
            return words.length;
        }
    }

    public static String replaceWord(String text, String oldWord, String newWord){

        if(text.isEmpty() || oldWord.isEmpty()|| newWord.isEmpty()){
            return "Text is empty";
        }
        else{
            return text.replace(oldWord,newWord);
        }
    }

}
