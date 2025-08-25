public class XYBalance {
 public boolean xyStringsBalance(String str) {
        int indexOfY = 0;
        int indexOfX = 0;
        if (str.equals("x")) return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y') indexOfY = i;
            else if (str.charAt(i) == 'x') indexOfX = i;
        }
        return indexOfY >= indexOfX;
    }
	}