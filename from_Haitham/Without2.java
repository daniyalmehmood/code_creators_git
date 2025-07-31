public class Without2 {
 public String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        String start = str.substring(0, 2);
        String end = str.substring(str.length() - 2);
        if (start.equals(end))
            return str.substring(2);
        return str;

    }
	}