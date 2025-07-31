public class TRA673{
 public static String everyNth(String str, int n) {
        if (n <= 0 || str.isEmpty()) {
            return "cannot do that";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= str.length() - 1; i += n) {
                sb.append(str.substring(i, i + 1));
            }
            return sb.toString();
        }
    }
	}