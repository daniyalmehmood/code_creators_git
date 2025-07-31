public class AtFirst {
public String atFirst(String str) {
        if (str.isEmpty())
            return "@@";
        else if (str.length() < 2)
            return str + "@";
        return str.substring(0, 2);
    }
	}