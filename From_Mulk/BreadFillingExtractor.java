public class BreadFillingExtractor {
    public String extractFillingBetweenBread(String str) {
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");
        for (int i = 0; i < str.length() - 5; i++) {
            if (firstBread >= 0 && lastBread >= 0 && firstBread != lastBread) {
                return str.substring(firstBread + 5, lastBread);

            }
        }
        return "";
    }
}
