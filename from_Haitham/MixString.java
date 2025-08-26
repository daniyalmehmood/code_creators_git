public class MixString {
public String mixer(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < Math.min(aLength, bLength); i++) {
            newString.append(a.charAt(i));
            newString.append(b.charAt(i));
        }
        if (aLength > bLength) newString.append(a.substring(bLength));
        else newString.append(b.substring(aLength));
        return newString.toString();

    }
	}