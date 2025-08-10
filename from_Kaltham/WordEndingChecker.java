public class WordEndingChecker {
    public int countWordsEndingWithYOrZ(String str) {
        int countYZ = 0;
        String newString = str.toLowerCase();
        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) == 'z' || newString.charAt(i) == 'y') {
                if (i == newString.length() - 1 || !Character.isLetter(newString.charAt(i + 1))) {
                    countYZ++;
                }
            }
        }
        return countYZ;
    }
}