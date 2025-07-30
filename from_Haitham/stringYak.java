public class stringYak {
public String stringYak(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.length() > i + 2) {
                if (str.substring(i, i + 3).equals("yak")) {
                    i += 2;
                    continue;
                } else newString += str.charAt(i);
            } else newString += str.charAt(i);
        }
        return newString;
    }
	}