public class MinCat {
public String minCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if (aLength > bLength)
            return a.substring(a.length() - bLength) + b;
        else return a + b.substring(b.length() - aLength);
    }
	}