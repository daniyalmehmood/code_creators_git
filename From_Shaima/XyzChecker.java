public class XyzChecker {
    public static boolean detectXyz(String str) {
        for (int i = 0; i < str.length() - 2; i++) {// use a for loop to go through the 'str'
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') { //check if the 'str' contain "xyz" in order
                if (i == 0 || str.charAt(i - 1) != '.') {  // if "xyz" start from the begin of 'str' OR no '.' before "x"
                    return true; // there is 'xyz' in the str and no '.' before 'x'
                }
            }
        }
        return false; // no "xyz" in the str
    }
    public static void main(String[] args) {
        System.out.println(detectXyz("abc.xyz"));
        System.out.println(detectXyz("abc.xyzxyz"));
    }
}
