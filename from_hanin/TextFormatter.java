public class TextFormatter {
    // Method to insert 'word' between the first two and last two characters of 'out'
    public String insertWord(String out, String word) {
        // Assumes 'out' is always 4 characters long
        return out.substring(0, 2) + word + out.substring(2, 4);
    }
}
