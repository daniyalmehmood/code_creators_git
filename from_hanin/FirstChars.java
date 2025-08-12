// A class that returns the first two characters of a given string
public class FirstChars {
    public String getFirstTwo(String str) {
        // If the string is longer than 2 characters, return the first two
        if (str.length() > 2) {
            return str.substring(0, 2);
        }

        // Otherwise, return the original string
        return str;
    }
}
