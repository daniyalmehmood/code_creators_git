public class ZipZap {
 public String zipZapRemover(String str) {
        StringBuilder result = new StringBuilder();
        if (str.length() < 3) return str;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append("zp");
                i += 2;
            } else result.append(str.charAt(i));

        }
        return result.toString();
    }
	}