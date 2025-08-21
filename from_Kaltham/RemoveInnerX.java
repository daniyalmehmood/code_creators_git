public class RemoveInnerX {
    public String removeInnerX(String str) {
        if (str.length() < 2) {
            return str;
        }
        String frontStr = str.substring(0, 1);
        String backStr = str.substring(str.length() - 1);
        String middleStr = str.substring(1, str.length() - 1);
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < middleStr.length(); i++) {
            if (middleStr.charAt(i) != 'x') {
                newStr.append(middleStr.charAt(i));
            }
        }

        return frontStr + newStr.toString() + backStr;
    }
}