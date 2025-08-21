public class WithoutX {
    public String withoutX(String str) {

        if (str.length() > 1) {
            StringBuilder newStr = new StringBuilder(str);
            if (str.charAt(0) == 'x') {
                newStr.deleteCharAt(0);
            }
            if (str.charAt(str.length() - 1) == 'x') {
                newStr.deleteCharAt(newStr.length() - 1);
            }
            return newStr.toString();
        }
        return "";
    }
}