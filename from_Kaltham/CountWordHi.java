public class CountWordHi {
    public int countWordHi(String str) {
        int countHi = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.length() >= 2 && str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                countHi++;
            }
        }
        return countHi;
    }
}