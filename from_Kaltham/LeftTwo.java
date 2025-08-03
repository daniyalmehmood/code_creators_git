public class LeftTwo {
    public String leftTwo(String str) {

        if (str.length() <= 2) {
            return str;
        }
        return (str.substring(2) + (str.substring(0, 2)));
    }
}