public class CheckEnds {
    public static String sameEnds(String string) {
        String finalStringResult = "";
        int middelLength = string.length() / 2;
        for (int i = 0; i < string.length() - 1; i++) {

            if (i < middelLength && string.substring(0, i + 1).equals(string.substring(string.length() - 1 - i)))
                finalStringResult = string.substring(0, i + 1);
        }
        return finalStringResult;
    }
}
