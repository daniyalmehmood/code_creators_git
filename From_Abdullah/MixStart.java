public class MixStart {
    public boolean hasMixAtStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        return str.substring (1,3).equals("ix");
    }
}
