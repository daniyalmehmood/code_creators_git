public class Last2 {
public static int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        String endString = str.substring(str.length() - 2, str.length());
        int count = 0;
        String twoChar;
        for (int i = 0; i < str.length() - 2; i++) {
            twoChar = str.substring(i, i + 2);
            if (twoChar.equals(endString))
                count++;
        }
        return count;
    }
	}
