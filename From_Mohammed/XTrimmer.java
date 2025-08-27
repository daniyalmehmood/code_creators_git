// Class for removing 'x' characters at string edges
public class XTrimmer {

    // Removes 'x' from start and/or end of the string
    public String removeX(String str) {
        if (str.length() == 0) return str;
        if (str.length() == 1) return (str.charAt(0) == 'x') ? "" : str;

        if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x')
            return str.substring(1, str.length() - 1);
        if (str.charAt(0) == 'x') return str.substring(1);
        if (str.charAt(str.length() - 1) == 'x') return str.substring(0, str.length() - 1);

        return str;
    }
}

