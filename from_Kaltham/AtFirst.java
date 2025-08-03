public class AtFirst {
    public String atFirst(String str) {

        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        if (str.length() == 1) {
            return str.substring(0) + "@";
        }
        return "@" + "@";
    }

}