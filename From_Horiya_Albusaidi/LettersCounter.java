public class LettersCounter {
    public int countTriplesLetters(String str) {
        int triplesCounter = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                triplesCounter++;
            }
        }
        return triplesCounter;
    }

}
