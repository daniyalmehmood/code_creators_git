public class StringBits {


    public static String stringBits(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + 2) {

            result.append(str.charAt(i));
        }
        return result.toString();
    }


    public static void main(String[] args) {

        System.out.println(StringBits.stringBits("Hello"));
        System.out.println(StringBits.stringBits("Chocoate"));
        System.out.println(StringBits.stringBits("Hello Kitten"));
        System.out.println(StringBits.stringBits("Greetings"));
        
    }
}

