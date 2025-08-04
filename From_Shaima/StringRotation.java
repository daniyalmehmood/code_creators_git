public class StringRotation {
    public static String moveFirstTwoCharToBack(String str) {
        if (str.length() <= 2)  // check the length of the input
        {
            return str; // return 'str' without changing while the length is less than equal 2
        }
        return str.substring(2) + str.substring(0, 2); // else return the output and make the first two chars to be at the back
    }
    public static void main(String[] args) {
        System.out.println(moveFirstTwoCharToBack("Hello"));
        System.out.println(moveFirstTwoCharToBack("Hi"));
        System.out.println(moveFirstTwoCharToBack("H"));
    }
}
