public class OneTwo {
    public String ReverseEveryThree(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= str.length() - 3; i += 3) {
            result.append(str.substring(i + 1, i + 3) + str.charAt(i));
        }
        return result.toString();
    }
	}