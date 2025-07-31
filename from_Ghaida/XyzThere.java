public class XyzThere {
    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz")); //true
        System.out.println(xyzThere("abc.xyz")); //false
        System.out.println(xyzThere("xyz.abc")); //true
    }
    public static boolean xyzThere(String str) {
        if(str.length() < 3){
            return false;
        }
        if (str.equals("xyz")){
            return true;
        }
        if(str.length() > 3) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 3).equals("xyz")) {
                    if (i == 0 || str.charAt(i - 1) != '.') {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
