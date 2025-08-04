public class RemoveMatchingStartSubstring {
    //this function checks and removes matching start substring
    public static String RemoveIfStartMatchesEnd(String str) {
        if (str.length() >= 2) {
            //get the First 2 characters in string
            String start = str.substring(0, 2);
            //get the last two characters in string
            String end = str.substring(str.length()-2);
            //if the Start and end substring are same
            if (start.equals(end)) {
                return str.substring(2);
            }
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(RemoveIfStartMatchEnd("HelloHe") );
        System.out.println(RemoveIfStartMatchEnd("HelloHi") );
        System.out.println(RemoveIfStartMatchEnd("Hi"));
    }
}
