public class XYZMiddle {
public boolean xyzMiddleChecker(String str) {
        int startIndex = 0;
        if (str.length() < 3) return false;
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.startsWith("xyz", i) && Math.abs(i - str.length() / 2) <= 2)
                startIndex = i;
            if (Math.abs(str.substring(0, startIndex).length() - str.substring(startIndex + 3).length()) < 2)
                return true;
        }

        return false;
    }
	}