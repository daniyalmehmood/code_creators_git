public class CharactorExtractor {
    public static String extractAlternativeChars(String str) {
        StringBuilder newStr= new StringBuilder();  // Create a StringBuilder object to build the final result 'newStr'
        for (int i=0 ;i<str.length(); i=i+2)  // Use a for-loop to go through each character of 'str'
        {
            newStr.append(str.charAt(i)); // add all elements , started from index 0 +2
        }
        return newStr.toString(); // return the value of 'newStr' after converted to String
    }
    public static void main (String[]args){
        System.out.println(extractAlternativeChars("Hello"));
        System.out.println(extractAlternativeChars("Hi"));
        System.out.println(extractAlternativeChars("Heeololeo"));
        System.out.println(extractAlternativeChars("HiHiHi"));
        System.out.println(extractAlternativeChars(""));
        System.out.println(extractAlternativeChars("Greetings"));
        System.out.println(extractAlternativeChars("Chocoate"));
        System.out.println(extractAlternativeChars("pi"));
        System.out.println(extractAlternativeChars("Hello Kitten"));
        System.out.println(extractAlternativeChars("hxaxpxpxy"));
    }
}
