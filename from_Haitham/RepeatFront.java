public class RepeatFront {
  public String repeatFrontByN(String str, int n) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < n; i++)
            newString.append(str, 0, n - i);
        return newString.toString();
    }

	}