public class WithoutX2{
public String withoutX2(String str) {
        if (str.length() < 2) return "";
        String newString = "";
        boolean first = false;
        if (str.startsWith("x")) {
            str = str.substring(1);
            first = true;
        }
        if (first && str.charAt(0) == 'x')
            str = str.substring(1);
        else if (str.charAt(1) == 'x') str = str.charAt(0) + str.substring(2);
        return str;
    }
	}