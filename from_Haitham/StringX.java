public class StringX {
public String stringX(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if ((i == 0 && str.charAt(i) == 'x') || (i == str.length() - 1 && str.charAt(i) == 'x'))
                newString += str.charAt(i);
            else if (str.charAt(i) == 'x') continue;
            else newString += str.charAt(i);
        }
        return newString;
    }
	}
