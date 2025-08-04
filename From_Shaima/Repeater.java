public class Repeater  {
    public static String repeatFront(String str, int n) {
        StringBuilder firstThreeIndex = new StringBuilder(); // Create a StringBuilder object to build 'firstThreeIndex' variable
        StringBuilder repeatedValue = new StringBuilder(); // Create a StringBuilder object to build the final result 'repeatedValue'
        if (!str.isEmpty() && str.length() >= 3 && n > 0)  // the 'str' should be not empty, the 'str' length is more than or equal 3 && the 'n' is positive
            {
            int length = str.length(); // initialize length variable and assign the length of the input string
            length = 3; // make the length is 3
                firstThreeIndex.append(str, 0, 3);  //assign to 'firstThreeIndex' to be the first 3 element from the 'str'
                for (int i = 0; i < n; i++) //use a for loop to go through the 'firstThreeIndex'
                {
                    repeatedValue.append(firstThreeIndex); // add the 'firstThreeIndex' to 'repeatedValue' after repeated 'n' times
                }
            }
        else  //the 'str' should be not empty, the 'str' length is less than 3 && the 'n' is positive
            {
            for (int i = 0; i < n; i++) //use a for loop to go through the 'str'
            {
                repeatedValue.append(str); // add the 'str' to 'repeatedValue' after repeated 'n' times
            }
        }
        return repeatedValue.toString(); // return the value of 'repeatedValue' after converted to string
    }
    public static void main (String[]args) {
        System.out.println(repeatFront("Chocolate",2));
        System.out.println(repeatFront("Chocolate",3));
        System.out.println(repeatFront("ABC",3));
        System.out.println(repeatFront("",3));
        System.out.println(repeatFront("Abc",0));
        System.out.println(repeatFront("A",4));
        System.out.println(repeatFront("A",-4));

    }
}
