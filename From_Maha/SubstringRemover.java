public class SubstringRemover {


     // Removes all substrings of length 3 that start with 'y' and end with 'k',
 // return the string after removing all such "yak"-like patterns

    public String stringYak(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2;  // Skip this "yak"-like pattern
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
