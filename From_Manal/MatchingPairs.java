
public class MatchingPairs {
    //this function counts how many 2-character substrings are the same in both strings at the same position
    public static int countMatchingPairs(String a, String b) {
        //find the length of the shorter string
        int stringlength = Math.min(a.length(), b.length());
        int count = 0;
        for (int i=0; i<stringlength-1; i++) {
            String aSubstring = a.substring(i, i+2);
            String bSubstring = b.substring(i, i+2);
            //compare the two substrings
            if (aSubstring.equals(bSubstring)) {
                //if they are equal, increase the counter
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(countMatchingPairs("xxcaazz", "xxbaaz") );
        System.out.println(countMatchingPairs("abc", "abc") );
        System.out.println(countMatchingPairs("abc", "axc"));
    }
}
