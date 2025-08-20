public class ZipZapCleaner {
    public static String zipZapCleaner(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                result.append("zp");
                i += 2;
            } else {

                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(zipZapCleaner("zipXzap"));
        System.out.println(zipZapCleaner("zopzop"));
        System.out.println(zipZapCleaner("zzzopzop"));
        System.out.println(zipZapCleaner("z"));
        System.out.println(zipZapCleaner(""));
    }
}
