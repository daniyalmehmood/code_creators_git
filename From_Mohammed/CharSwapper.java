// Class for swapping characters
public class CharSwapper {

    // Swaps the last 2 characters of the string
    public String swapLastTwo(String str) {
        if (str.length() < 2)
            return str;

        return str.substring(0, str.length() - 2)
                + str.charAt(str.length() - 1)
                + str.charAt(str.length() - 2);
    }
}
