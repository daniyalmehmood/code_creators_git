public class StringRepeater {
    public String repeatFrontTwice(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        String frontTwo = str.substring(0, 2);
        return frontTwo + frontTwo + frontTwo;
    }
}
