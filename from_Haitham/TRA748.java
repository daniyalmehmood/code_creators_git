public class TRA748{
public static String startOz(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.startsWith("o")) {
            sb.append("o");
        }
        if (str.startsWith("z", 1)) {
            sb.append("z");
        }
        if (sb.isEmpty()) {
            return "No start with oz";
        } else return sb.toString();
    }
	}