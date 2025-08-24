public class StringBits {
public String stringBits(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) newString += str.charAt(i);
        }
        return newString;
    }
	}
