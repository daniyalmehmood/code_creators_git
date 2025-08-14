public class SubstringPatternChecker  {
    public static int countLast2SubstringMatch(String str) {
        int count=0;  // initialize  'count' variable
        if (str.length()<=2) // check if the 'str' length is less than2
        {
            return 0;  //return 0 , if the 'str' length is less than 2
        }
         String lastTwoChar = str.substring(str.length() -2); // initialize  'lastTwoChar' variable and assigned the last 2 elements in the 'str'

        for (int i = 0; i < str.length()-2; i++)  // Use a for-loop to go through each character in the 'str' unless the last 2 character
        {
            if (str.substring(i,i+2).equals(lastTwoChar)) // check if any substring of 2 characters is same as the 'lastTwoChar'
            {
                count++;  // +1 to 'count' variable if the condition is true
            }
        }
        return count; // return the last update of count to be displayed.
    }
    public static void main(String[] args) {
        System.out.println(countLast2SubstringMatch("hixxhi"));
        System.out.println(countLast2SubstringMatch("xaxxaxaxx"));
        System.out.println(countLast2SubstringMatch("axxxaaxx"));
        System.out.println(countLast2SubstringMatch("11212"));
        System.out.println(countLast2SubstringMatch("13121311"));
        System.out.println(countLast2SubstringMatch("hi"));
        System.out.println(countLast2SubstringMatch("h"));
        System.out.println(countLast2SubstringMatch(""));
    }
}