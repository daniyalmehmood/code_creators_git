public class WordMasker {
    public String plusOutNonWordCharacters(String str, String word) {
        StringBuffer newString = new StringBuffer();
        int indexOfWord = str.indexOf(word, 0);
        for (int i = 0; i < str.length(); i++) {
            if (i == indexOfWord) {
                newString.append(word);
                i = i + word.length() - 1;
                indexOfWord = str.indexOf(word, indexOfWord + word.length());
            } else {
                newString.append("+");
            }
        }
        return newString.toString();
    }
}


