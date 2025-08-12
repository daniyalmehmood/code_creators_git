public class Ntwice {
    public String takeNTwice(String str, int n) {
        // Null check and length safety
        if (str == null || str.length() < n) {
            return "";
        }

        // Get first n and last n characters, and concatenate them
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}
