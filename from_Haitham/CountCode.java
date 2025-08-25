public class CountCode {
public int countWordCode(String str) {
        int countCode = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("co", i) && str.charAt(i + 3) == 'e') countCode++;
        }
        return countCode;
    }
	}