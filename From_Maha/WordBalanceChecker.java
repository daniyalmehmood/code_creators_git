public class WordBalanceChecker {
    public boolean hasEqualCatAndDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("cat", i)) {
                catCount++;
            }
            if (str.startsWith("dog", i)) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }
}
