public class HasBad {
    public boolean hasBadAtStart(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("bad") || str.length() >= 4 && str.substring(1, 4).equals("bad")) {
            return true;
        } else {
            return false;
        }
    }
}