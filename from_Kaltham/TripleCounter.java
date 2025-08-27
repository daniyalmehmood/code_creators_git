public class TripleCounter {
    public int countTripleSequences(String str) {
        int countTriple = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) {
                countTriple++;
            }
        }
        return countTriple;
    }
}