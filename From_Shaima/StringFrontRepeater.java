public class StringFrontRepeater {
    public static String repeatDecreasingFront(String str, int n) {
        StringBuilder result = new StringBuilder(); // initialize a string builder to store the result
        for (int i = 0; i < n; i++) { //use a for loop to go through the str  and repeat it n time
            result.append(str, 0, n-i); //add the end part of 'str' to result
        }
        return result.toString(); // return value of result after converted to string
    }
    public static void main(String[] args) {
        System.out.println(repeatDecreasingFront("Chocolate", 4));
        System.out.println(repeatDecreasingFront("Chocolate", 3));
        System.out.println(repeatDecreasingFront("Chocolate", 2));
        System.out.println(repeatDecreasingFront("Ice Cream", 2));
    }
}
