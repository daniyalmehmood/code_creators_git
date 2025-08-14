public class StringYak {

    public String removeYakSubstrings(String str) {
        String result = "";

        for (int i = 0; i < str.length(); ) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 'k') {
                i += 3;
            } else {
                result += str.charAt(i);
                i++;
            }
        }

        return result;
    }
}
