public class StartWord {

    public String matchWordAtStart(String str, String word) {
        int lenStr= str.length();
        int lenWord=word.length();

        if (lenStr<lenWord) return "";

        if (lenWord==1 || str.substring(1,lenWord).equals(word.substring(1))){

            return str.substring (0,lenWord);
        }
        return "";
    }

}
