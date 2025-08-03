public class WithoutXTwo {
    public String withoutXTwo(String str) {
        StringBuilder newStr = new StringBuilder(str);

        if (str.length() > 1 && str.charAt(1) == 'x') {
            newStr.deleteCharAt(1);
        }
        if (str.length() >= 1 && newStr.charAt(0) == 'x') {
            newStr.deleteCharAt(0);

        }

        return newStr.toString();
    }
}