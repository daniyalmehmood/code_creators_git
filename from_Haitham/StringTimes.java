public class StringTimes {
public String stringTimes(String str, int n) {
        if (n < 0) {
            return null;
        }
        StringBuilder newBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            newBuilder.append(str);
        }
        return newBuilder.toString();

    }
	}