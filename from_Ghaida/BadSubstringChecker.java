public class BadSubstringChecker {
    public static void main(String[] args){
        System.out.println(containsBadSubstring("badxx"));// → true
        System.out.println(containsBadSubstring("xbadxx")); // → true
        System.out.println(containsBadSubstring("xxbadxx")); // → false
    }
    public static boolean containsBadSubstring(String str) {
        if(str.length() < 3){
            return false;
        }
        if(str.startsWith("bad")){
            return true;
        }
        if(str.length() > 3 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }
}
