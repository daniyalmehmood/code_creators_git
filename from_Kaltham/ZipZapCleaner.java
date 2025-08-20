public class ZipZapCleaner {
    public String removeCharBetweenZAndP(String str) {
        StringBuilder resultOfString = new StringBuilder(str);
        if (str.length() < 3) {
            return str;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (resultOfString.charAt(i) == 'z' && resultOfString.charAt(i + 2) == 'p') {
                resultOfString.deleteCharAt(i + 1);
            }
        }
        return resultOfString.toString();
    }
}