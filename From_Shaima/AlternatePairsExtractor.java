public class AlternatePairsExtractor {
    public static String extractAlternatePairs(String str) {
        StringBuilder altPair = new StringBuilder(); // Create a StringBuilder object to build 'altPair' variable
        if (str.length() <= 2) // check the length of 'str' is less than or equal 2
        {
            return str; // return 'str' in the output
        }
        // the str length is greater than 2
            for (int i = 0; i < str.length(); i+=4) // use a  for loop to go through the char of the 'str' ,i+=4 is take 2 indexes skip 2 indexes
            {
                int endIndex = i + 2; // initialize  'endIndex ' variable and assign be value of i +2 to its
                if (endIndex > str.length())  // check if the value of 'endIndex' is greater than the length of 'str'
                {
                    endIndex = str.length(); // make 'endIndex' to be the length of the 'str'
                }
                altPair.append(str, i, endIndex); // add the char from 'str' starts from i until last to thw 'altPair'
            }
            return altPair.toString(); // return the value of 'altPair' after converting to string
    }
    public static void main (String[] args) {
        System.out.println(extractAlternatePairs("kitten"));
        System.out.println(extractAlternatePairs("Chocolate"));
        System.out.println(extractAlternatePairs("CodingHorror"));
        System.out.println(extractAlternatePairs("yak"));
        System.out.println(extractAlternatePairs("ya"));
        System.out.println(extractAlternatePairs("y"));
        System.out.println(extractAlternatePairs(""));
    }
}
