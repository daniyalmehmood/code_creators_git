//AP-1 > commonTwo

public class CommonWordsCounter {
    public int countCommonWords(String[]a, String[]b) {
        int commonCount = 0;
        String combainAB = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j]) && !combainAB.contains(a[i])) {
                    combainAB += a[i];
                    commonCount++;
                }
            }
        }

        return commonCount;
    }
}