public class AltPairsChecker {
    public String getAltPairs(String str) {
        int count = 0;
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (count <= 1) {
                newString.append(str.charAt(i));
                count++;
            } else {
                i = i + 1;
                count = 0;
            }
        }
        return newString.toString();
    }

}
