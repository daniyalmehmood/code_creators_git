public class RemoveInnerX {
    public String removeInnerX(String str) {
        if (str.length() < 2 || str.isEmpty()) {
            return str;
        }
        String front = str.substring(0, 1);
        String back = str.substring(str.length() - 1);
        String str3 = str.substring(1, str.length() - 1);
        StringBuilder str1 = new StringBuilder(str3);
        StringBuilder newstr = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != 'x') {
                newstr.append(str1.charAt(i));
            }
        }

        return front + newstr.toString() + back;
    }
}