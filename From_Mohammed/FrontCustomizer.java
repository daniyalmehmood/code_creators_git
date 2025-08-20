// Class for customizing string front
public class FrontCustomizer {

    // Keeps 'a' at position 0 and 'b' at position 1 if present, drops others
    public String customizeFront(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'a') result += 'a';
        if (str.length() >= 2 && str.charAt(1) == 'b') result += 'b';
        if (str.length() > 2) result += str.substring(2);

        return result;
    }
}
