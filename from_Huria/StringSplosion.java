public class StringSplosion {

    public static String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str, 0, i + 1);

        }

        return result.toString();
    }


    public static void main(String[] args) {

        System.out.println(StringSplosion.stringSplosion("Code"));
        System.out.println(StringSplosion.stringSplosion("abc"));
        System.out.println(StringSplosion.stringSplosion("ab"));
        System.out.println(StringSplosion.stringSplosion("fade"));


    }
}
