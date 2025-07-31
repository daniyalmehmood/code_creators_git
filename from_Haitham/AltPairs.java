public class AltPairs {
public String altPairs(String str) {
        String newString = "";
        int index = 0;
        while (index < str.length()) {
            if (index + 2 > str.length()) newString += str.substring(index);
            else newString += str.substring(index, index + 2);
            index += 4;
        }
        return newString;
    }
	}
