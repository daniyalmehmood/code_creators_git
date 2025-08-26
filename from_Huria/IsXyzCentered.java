public class IsXyzCentered {
    public static boolean checkXyz(String str) {
        if (str.equals("xyz")) {
            return true;
        }
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                int firstLength = i;
                int lastLength = str.length() - (i + 3);
                if (Math.abs(lastLength - firstLength) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(checkXyz("AAxyzBB"));
        System.out.println(checkXyz("AxyzBB"));
        System.out.println(checkXyz("AxyzBBB"));
        System.out.println(checkXyz("xyz"));
        System.out.println(checkXyz("AABBxy"));
        System.out.println(checkXyz("AABBx"));
        System.out.println(checkXyz("AAAxyzB"));
        System.out.println(checkXyz("xyzxyzAxyzxyzxy"));
    }
}