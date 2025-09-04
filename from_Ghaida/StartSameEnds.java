public class StartSameEnds {
    public static void main(String[] args) {
        System.out.println(checkIfStartSameEnds("abXYab")); // → "ab"
        System.out.println(checkIfStartSameEnds("xx"));// → "x"
        System.out.println(checkIfStartSameEnds("xxx"));// → "x"
    }
    public static String checkIfStartSameEnds(String string) {
        for (int i = string.length() / 2; i > 0; i--) { //start from middle and go down
            //the longest possible prefix that can match a suffix can only be at most length/2 chars long
            String prefixOfString = string.substring(0, i);
            String suffixOfString = string.substring(string.length() - i);
            if (prefixOfString.equals(suffixOfString)) {
                return prefixOfString; // Return the matching char
            }
        }
        return "";// Return an empty string if no match is found
    }
}
