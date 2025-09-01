public class XYZThere {
    public static boolean hasUnprefixedXyz(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }
public static void main (String[]args){
    System.out.println(hasUnprefixedXyz("abcxyz"));
    System.out.println(hasUnprefixedXyz("abc.xyz"));
    System.out.println(hasUnprefixedXyz("xyz.abc"));
}
}

