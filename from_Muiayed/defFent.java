public class defFent {
    public String deFront(String str) {
        if (str.length() == 0) return str;          // empty string
        if (str.length() == 1) {                    // 1-char string
            return str.charAt(0) == 'a' ? "a" : "";
        }

        StringBuilder keep = new StringBuilder();

        // first character
        if (str.charAt(0) == 'a') keep.append('a');

        // second character
        if (str.charAt(1) == 'b') keep.append('b');

        // everything after index 1
        if (str.length() > 2) keep.append(str.substring(2));

        return keep.toString();
    }
}
