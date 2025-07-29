public class Front3 {

    public static String front3(String str) {
        StringBuilder builder = new StringBuilder();
        if (str.length() >= 3) {
            String firstThreeChar = str.substring(0, 3);
            builder.append(firstThreeChar.repeat(3));
        } else {
            builder.append(str.repeat(3));
        }
        return builder.toString();
    }
}
