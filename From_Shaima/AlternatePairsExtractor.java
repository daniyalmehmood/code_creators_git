public class AlternatePairsExtractor {
    public static String extractAlternatePairs(String str) {
        StringBuilder newStr = new StringBuilder(); // Create a StringBuilder object to build 'newStr' variable
        if (str.length() <= 2) // check the length of 'str' is less than or equal 2
        {
            return str; // return 'str' in the output
        }
        // the str length is greater than 2
            for (int i = 0; i < str.length(); i+=4) // use a  for loop to go through the char of the 'str' ,i+=4 is take 2 indexes skip 2 indexes
            {
                int last = i + 2; // initialize  'last ' variable and assign be value of i +2 to its
                if (last > str.length())  // check if the value of 'last' is greater than the length of 'str'
                {
                    last = str.length(); // make 'last' to be the lenght of the 'str'
                }
                newStr.append(str, i, last); // add the char from 'str' starts from i until last to thw 'newStr'
            }
            return newStr.toString(); // return the value of 'newStr' after converting to string
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
