public class xyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB")); //true
        System.out.println(xyzMiddle("AxyzBB")); //true
        System.out.println(xyzMiddle("AxyzBBB")); //false
    }
    public static boolean xyzMiddle(String str) {
        int lenOfString = str.length();
        if(str.length() < 3){
            return false;
        }
        for (int i = 0; i <= lenOfString - 3; i++) { // Check if "xyz" exists at i index
            if (str.substring(i, i + 3).equals("xyz")) {
                int leftCountChar = i;
                int rightCountChar = lenOfString - (i + 3);
                if (Math.abs(leftCountChar - rightCountChar) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }
}