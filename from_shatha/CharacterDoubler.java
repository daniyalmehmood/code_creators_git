public class CharacterDoubler {
    public static String doubleEachChar(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append(c).append(c);
        }
        return result.toString();
    }
    public static void main (String[]args){
        System.out.println(doubleEachChar("The"));
        System.out.println(doubleEachChar("AAbb"));
        System.out.println(doubleEachChar("Hi-There"));
    }
}
