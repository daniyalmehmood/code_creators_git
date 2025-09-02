//AP-1 > scores100

public class HundredPair {
    public boolean hasConsecutiveHundreds(int[]scores) {
        if (scores.length >= 2) {
            for (int i = 0; i < scores.length - 1; i++) {
                if (scores[i] == 100 && scores[i] == scores[i + 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}