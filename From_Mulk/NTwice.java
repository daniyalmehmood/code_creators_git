public class NTwice {
    public String getNTwiceChars(String str, int n) {
        if (str.length() >= n) {
            return str.substring(0, n) + str.substring(str.length() - n);
        } else {
            return "";
        }
    }
}