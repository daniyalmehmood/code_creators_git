public class StarInserter {
    public String insertStars(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return str.charAt(0) + "*" + insertStars(str.substring(1));
        }
    }

}
