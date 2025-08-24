public class XYZThereChecker {

    public static boolean xyzThere(String str) {
        int len = str.length();

        for (int i = 0; i <= len - 3; i++) {
            // Check if substring starting at i is "xyz"
            if (str.substring(i, i + 3).equals("xyz")) {
                // Check if 'xyz' is at the start or NOT preceded by '.'
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));    
        System.out.println(xyzThere("abc.xyz"));   
        System.out.println(xyzThere("xyz.abc"));  
    }
}