public class CountCharacters {
    public int countNumberOfLetterXInString(String str) {
        if (str.isEmpty()) return 0;
        if (str.length() == 1 && str.charAt(0) == 'x') return 1;
        if (str.endsWith("x"))
            return 1 + countNumberOfLetterXInString(str.substring(0, str.length() - 1));
        else return countNumberOfLetterXInString(str.substring(0, str.length() - 1));
    }

}
