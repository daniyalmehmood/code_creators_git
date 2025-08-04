public class StringYak {
    public String removeYakSubstrings(String str) {

        StringBuilder newString = new StringBuilder(str);
        for (int i = 0; i < newString.length() - 2; i++) {
            if (newString.charAt(i) == 'y' && newString.charAt(i + 1) == 'a' && newString.charAt(i + 2) == 'k') {
                newString.delete(i, i + 3);
            }

        }
        return newString.toString();
    }
}