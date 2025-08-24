// Class for trimming and joining strings
public class StringMinCat {

    // Trims both strings to same length and joins them
    public String concatMinimized(String a, String b) {
        int minLength = Math.min(a.length(), b.length());
        String newA = a.substring(a.length() - minLength);
        String newB = b.substring(b.length() - minLength);
        return newA + newB;
    }
}
