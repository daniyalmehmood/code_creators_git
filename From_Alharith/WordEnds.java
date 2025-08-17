public class WordEnds {

    public String getCharsAroundWord(String str, String word) {
        StringBuilder result= new StringBuilder();
        int lenWord= word.length();

        for (int i=0; i<=str.length()-lenWord; i++){

            if (str.substring(i, i + lenWord).equals(word)) {
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }
                if (i + lenWord < str.length()) {
                    result.append(str.charAt(i + lenWord));
                }

            }}
        return result.toString();
    }



}
