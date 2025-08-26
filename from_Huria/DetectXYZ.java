public class DetectXYZ {
    public static boolean detectXyz(String str) {
        for (int i = 0; i < str.length() - 2; i++)
            if ((str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z')) {
                if (i == 0) return true;
                else {
                    if (str.charAt(i - 1) == '.') continue;
                    else return true;
                }


            }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(detectXyz("abcxyz"));
        System.out.println(detectXyz("abc.xyz"));
        System.out.println(detectXyz("xyz"));
        System.out.println(detectXyz("x"));
        System.out.println(detectXyz("abc.xyzxyz"));
        System.out.println(detectXyz("12.xyz"));
        System.out.println(detectXyz(".xyz"));
        System.out.println(detectXyz(""));
    }
}