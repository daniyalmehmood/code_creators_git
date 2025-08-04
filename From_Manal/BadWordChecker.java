public class BadWordChecker {
    public static boolean startsWithBadAtBeginningOrFirst(String str) {
        //check if "Bad" Starts at index 0
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
            return true;
        }
        //check if "Bad" starts at index 1
        if (str.length() >=4 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        //"Bad" was not found
        return false;
    }
    public static void main(String[] args) {
        System.out.println(startsWithBadAtBeginningOrFirst("badxx") );
        System.out.println(startsWithBadAtBeginningOrFirst("xbadxx") );
        System.out.println(startsWithBadAtBeginningOrFirst("xxbadxx") );
    }
}
