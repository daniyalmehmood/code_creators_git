public class CountingAppearancesOfStrings {
    public static boolean checkEqualityAppearancesOfIsAndNotWords(String str) {
        int isWordCounter = 0;
        int notWordCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("is", i)) {
                isWordCounter++;
            }
            if (str.startsWith("not", i)) {
                notWordCounter++;
            }
        }
        return isWordCounter == notWordCounter;
    }
}
