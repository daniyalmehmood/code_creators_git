public class XyzThere {
    public boolean xyzThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        XyzThere xt = new XyzThere();
        System.out.println(xt.xyzThere("abcxyz"));
        System.out.println(xt.xyzThere("abc.xyz"));
        System.out.println(xt.xyzThere("xyz.abc"));
    }
}