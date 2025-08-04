public class CheckMatchingStartEnd {
    public static boolean startsAndEndWithSameTwoChars(String str) {
        //if the string is shorter than 2 chars, return false
        if (str.length() < 2) {
            return false;
        }
        //extract first and last two chars
        String front = str.substring(0, 2);
        String end = str.substring(str.length() - 2);
        return front.equals(end);
    }
    public static void main(String[] args) {
        System.out.println(startsAndEndWithSameTwoChars("edited"));
        System.out.println(startsAndEndWithSameTwoChars("edit") );
        System.out.println(startsAndEndWithSameTwoChars("ed"));
    }
    }
