public class ExtractFirstAndLastChars {
    public static String getFirstAndLastNCharacters(String str, int n) {
        //Extract the first N character
        String first = str.substring(0, n);
        //Extract the last N Characters
        String last = str.substring(str.length()-n);
        //combine both parts

        return first + last;
    }
    public static void main(String[] args) {
        System.out.println(getFirstAndLastNCharacters("Hello", 2));
        System.out.println(getFirstAndLastNCharacters("Chocolate", 3));
        System.out.println(getFirstAndLastNCharacters("Chocolate", 1));
    }

}
