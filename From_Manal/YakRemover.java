
public class YakRemover {
//this function removes Yak pattern from string
    public static String cleanYakFromString(String str) {
        StringBuilder string1 = new StringBuilder(str);
        int i = 0;
        while (i <= string1.length() - 3) {
            if (string1.substring(i, i + 3).equals("yak")) {
                string1.delete(i, i + 3);
            } else {
                i++;
            }

        }
        return string1.toString();
    }
    public static void main(String[] arg) {
        System.out.println(cleanYakFromString("yakpak"));
        System.out.println(cleanYakFromString("pakyak"));
        System.out.println(cleanYakFromString("yak123ya"));
    }
}