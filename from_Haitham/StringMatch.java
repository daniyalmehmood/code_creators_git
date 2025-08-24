public class StringMatch {
public int stringMatch(String a, String b) {
        int smallestLength = a.length();
        if (smallestLength > b.length())
            smallestLength = b.length();
        int count = 0;
        for (int i = 0; i < smallestLength - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2)))
                count++;
        }
        return count;
    }
	}
