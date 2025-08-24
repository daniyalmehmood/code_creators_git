public class StringSplosion {
public String stringSplosion(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString += str.substring(0, i + 1);
        }
        return newString;
    }
	}
