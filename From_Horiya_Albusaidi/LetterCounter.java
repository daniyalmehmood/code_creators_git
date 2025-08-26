public class LetterCounter {
    public static int countNumberOfLetterZAndY(String str) {
        int letterCounter = 0;
        str = str.toLowerCase();
        for (int i = 1; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                continue;
            } else {
                if (str.charAt(i - 1) == 'z' || str.charAt(i - 1) == 'y')
                    letterCounter++;
            }
        }
        if (str.endsWith("z") || str.endsWith("y"))
            letterCounter++;
        return letterCounter;
    }
}
