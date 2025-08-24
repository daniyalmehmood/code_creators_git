public class WithoutX{
 public String withoutX(String str) {
        if (str.length() < 2) return "";
        StringBuilder newString = new StringBuilder();
        if (!str.startsWith("x"))
            newString.append(str.charAt(0));
        if (!str.endsWith("x")) newString.append(str.substring(1));
        else newString.append(str, 1, str.length() - 1);
        return newString.toString();
    }
	}