public class StringRemover {
    public static String removeSubstringIgnoreCase(String base, String remove) {
        return base.replaceAll("(?i)" + java.util.regex.Pattern.quote(remove), "");
    }

public static void main(String arg[]){
    System.out.println(removeSubstringIgnoreCase("Hello there", "llo"));
    System.out.println(removeSubstringIgnoreCase("Hello there", "e"));
    System.out.println(removeSubstringIgnoreCase("Hello there", "x"));
}
}