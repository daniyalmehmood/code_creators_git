public class FindBetweenSandwish {
    public String getBetweenSandwich(String str) {
        int firstBread = -1;
        int lastBread = -1;
        for (int i = 0; i < str.length() - 4; i++) {
            if (str.substring(i, i + 5).equals("bread")) {
                if (firstBread == -1) {
                    firstBread = i;
                }
                lastBread = i;

            }
        }
        if (firstBread != -1 && lastBread != -1 && firstBread != lastBread) {
            return str.substring(firstBread + 5, lastBread);
        }
        return "";
    }
}