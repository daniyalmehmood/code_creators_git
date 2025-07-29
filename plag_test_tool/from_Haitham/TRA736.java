public class TRA736{
public static String delDel(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (str.startsWith("del", 1)) {
            sb.delete(1, 4);
            return sb.toString();
        } else return str;
    }
	}