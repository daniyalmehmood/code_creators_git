public class SubstringCounter {
    public int countOccurrencesOfHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("hi", i)) {
                count++;
            }
        }
        return count;
    }
}
