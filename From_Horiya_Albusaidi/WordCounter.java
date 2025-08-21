public class WordCounter {
    public int countHiStringInWord(String str) {
        if (str.isEmpty() || str.length() == 1) return 0;
        if (str.length() == 2 && str.startsWith("hi")) return 1;
        if (str.endsWith("hi"))
            return 1 + countHiStringInWord(str.substring(0, str.length() - 1));
        else return countHiStringInWord(str.substring(0, str.length() - 1));
    }

}
