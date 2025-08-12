public class FrontTimes{
public String frontTimes(String str, int n) {
        StringBuilder str1 = new StringBuilder();
        if (str.length() <= 0) {
            return "";
        }
        for (int i = 0; i < n; i++) {

            str1.append(str.length() < 3 ? str : str.substring(0, 3));
        }
        return str1.toString();
    }
	}