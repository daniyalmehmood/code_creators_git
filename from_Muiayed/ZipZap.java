public class ZipZap {
    public String zipZap(String str) {
        StringBuilder out = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (i <= str.length() - 3 &&
                    str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                out.append('z').append('p');
                i += 3;
            } else {
                out.append(str.charAt(i));
                i++;
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {
        ZipZap zz = new ZipZap();
        System.out.println(zz.zipZap("zipXzap"));
        System.out.println(zz.zipZap("zopzop"));
        System.out.println(zz.zipZap("zzzopzop"));
    }
}