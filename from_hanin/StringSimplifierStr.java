public class StringSimplifierStr {
    public String reduceRepeats(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            char firstChar = str.charAt(0);
            char secondChar = str.charAt(1);
            if (firstChar == secondChar) {
                return reduceRepeats(str.substring(1));
            } else {
                return firstChar + reduceRepeats(str.substring(1));
            }
        }
    }

}

