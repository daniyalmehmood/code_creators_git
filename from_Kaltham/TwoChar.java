public class TwoChar {
    public String twoChar(String str, int index) {

        if (str.length() >= 2 && index >= 0 && index < str.length() - 1) {
            return str.substring(index, index + 2);
        }
        return str.substring(0, 2);

    }
}