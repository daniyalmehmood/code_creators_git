public class DeFront{
public String deFront(String str) {
        String newString;
        StringBuilder strBuilder = new StringBuilder();
        if (!str.isEmpty() && str.charAt(0) == 'a')
            strBuilder.append(str.charAt(0));
        if (str.charAt(1) == 'b')
            strBuilder.append(str.charAt(1));
        strBuilder.append(str.substring(2));
        return strBuilder.toString();
    }
	}