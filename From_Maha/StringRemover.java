//String-3 > withoutString
public class StringRemover {
    public String withoutString(String base, String remove) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < base.length()) {
            if (i + remove.length() <= base.length() &&
                    base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
                i += remove.length();
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
}
