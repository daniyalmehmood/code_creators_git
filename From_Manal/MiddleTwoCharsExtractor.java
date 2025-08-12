public class MiddleTwoCharsExtractor {
    public static String getMiddleTwoCharacters(String str) {
        //calculate the middle index
        int mid = str.length()/2;
        return str.substring(mid-1, mid+1);

    }

    public static void main(String[] args) {
        System.out.println(getMiddleTwoCharactars("string"));
        System.out.println(getMiddleTwoCharactars("code"));
        System.out.println(getMiddleTwoCharactars("Practice"));
    }
    }
