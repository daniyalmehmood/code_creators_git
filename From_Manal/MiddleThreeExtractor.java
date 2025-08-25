public class MiddleThreeExtractor {
    public static String extractMiddleThree(String str) {
        //Find the Middle index
        int mid = str.length() / 2;
        //use substring to get one character befor, middle character, one character after
        return str.substring(mid - 1, mid + 2);
    }
    public static void main(String[] args) {
        System.out.println(extractMiddleThree("Candy"));
        System.out.println(extractMiddleThree("and") );
        System.out.println(extractMiddleThree("solving"));
    }

    }