public class DoubleChar {
    public String doubleCharFinder(String str) {
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            resultString.append(str.substring(i, i + 1)).append(str.charAt(i));
        }
        return resultString.toString();
    }
	}