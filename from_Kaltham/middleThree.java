public class MiddleThree {
    public String middleThree(String str) {
        String noSpace = str.replaceAll("\\s+", "");
        int l = noSpace.length() / 2;
        int l2 = str.length() / 2;

        if (noSpace.length() == 3) {
            return str;
        } else {
            return noSpace.substring(l - 1, l + 2);
        }

    }
}