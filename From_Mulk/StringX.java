public class StringX {
    public String removeXExceptEdges(String str) {
        if (str.length() <= 1) {
            return str;
        }
        StringBuilder newString = new StringBuilder();
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                newString.append(str.charAt(i));
            }

        }
        return str.substring(0, 1) + newString.toString() + str.substring(str.length() - 1);
    }
}