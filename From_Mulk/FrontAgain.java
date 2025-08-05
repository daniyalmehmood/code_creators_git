public class FrontAgain {
    public boolean hasSamePrefixAndSuffix(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2).equals(str.substring(str.length() - 2));
        } else {
            return false;
        }
    }
}
