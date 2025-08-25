public class CharacterDoubler {
    public  static String repeatCharacters (String str) {
        StringBuilder newWord = new StringBuilder(str);
        for (int i = 0; i <str.length() ; i++) {
            char firstChar = str.charAt(i) ;
            newWord.append(firstChar).append(firstChar); // Append each character twice

        }
        return newWord.toString();
    }
}
