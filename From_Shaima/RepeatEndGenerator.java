public class RepeatEndGenerator {
    public static String repeatLastNCharacters(String str, int n) {
        StringBuilder result = new StringBuilder(); // initialize a string builder to store the result
        for (int i=0 ; i<n; i++){ //use a for loop to go through the str  and repeat it n time
            result.append(str,str.length()-n,str.length()); //add the end part of 'str' to result
        }
        return result.toString(); // return value of result after converted to string
    }
    public static void main(String[] args) {
        System.out.println(repeatLastNCharacters("Hello",3));
        System.out.println(repeatLastNCharacters("Hello",2));
        System.out.println(repeatLastNCharacters("Hello",1));
    }
}

