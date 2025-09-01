public class BreadExtractor {
    public String getSandwich(String str) {
        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");
        for (int i = 0; i < str.length(); i++) {
            if (firstBread != lastBread) {
                return str.substring(firstBread + 5, lastBread);
            }

        }


        return "";
    }


}
