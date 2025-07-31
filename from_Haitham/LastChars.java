public class LastChars {
public String lastChars(String a, String b) {
        String newString = "";
        if (a.isEmpty() && !b.isEmpty())
            return "@" + b.charAt(b.length() - 1);
        else if (!a.isEmpty() && b.isEmpty())
            return a.charAt(0) + "@";
        else if (a.isEmpty() && b.isEmpty()) return "@" + "@";
        return a.substring(0, 1) + b.charAt(b.length() - 1);
    }
	}