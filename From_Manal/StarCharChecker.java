public class StarCharChecker {
    // Returns true if for every '*' in the string,
    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                // Check chars before and after '*'
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false; 
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));  
        System.out.println(sameStarChar("xy*zzz"));  
        System.out.println(sameStarChar("*xa*az"));  
    }
}