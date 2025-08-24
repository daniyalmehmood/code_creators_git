public class FrontTimes {
public String frontTimes(String str, int n) {
        String frontString = "";
        int endIndex = 0;
        if (n <= 0) return frontString;
        else if (str.length() < 3) endIndex = str.length();
        else endIndex = 3;
        frontString = str.substring(0, endIndex);
        for (int i = 0; i < n - 1; i++)
            frontString += str.substring(0, endIndex);
        return frontString;

    }
	}
