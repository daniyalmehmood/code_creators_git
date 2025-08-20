public class RemoveStarsAndNeighbors {
    public String removeStarsWithNeighbors(String str) {
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '*') {
                if ((i == 0 || str.charAt(i - 1) != '*') && (i == str.length() - 1 ||
                        str.charAt(i + 1) != '*')) {
                    finalString.append(str.charAt(i));
                }
            }
        }
        return finalString.toString();
    }
}