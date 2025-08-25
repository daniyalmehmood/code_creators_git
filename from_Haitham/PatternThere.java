public class PatternThere {
 public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (i == 0 && str.substring(i, i + 3).equals("xyz")) return true;
            else if (i > 0 && str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.') return true;
        }
        return false;
    }
	}