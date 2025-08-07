public class ZipZap {
    public static String ignoreBetweenZP(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i + 2 < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append('z');
                result.append('p');
                i += 2;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(ignoreBetweenZP("zipXzap"));
        System.out.println(ignoreBetweenZP("zopzop"));
        System.out.println(ignoreBetweenZP("zzzopzop"));
    }
}