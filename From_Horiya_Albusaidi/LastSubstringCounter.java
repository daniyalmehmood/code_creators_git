public class LastSubStringCounter {
    public int countTimesOfLastSubstringMatch(String str) {
        if (str.isEmpty() || str.length() == 1)
            return 0;
        String lastChars = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {

            if (str.substring(i, i + 2).equals(lastChars)) {
                count++;
            }
        }
        return count;
    }

}