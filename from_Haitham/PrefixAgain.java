public class PrefixAgain {
 public boolean prefixAgainChecker(String str, int n) {
        String prefix = str.substring(0, n);
        int count = 0;
        for (int i = 0; i <= str.length() - n; i++) {
            if (str.substring(i, n + i).equals(prefix)) count++;
        }
        return count > 1;
    }
	}