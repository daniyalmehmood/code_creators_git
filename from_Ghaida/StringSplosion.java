public class StringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code")); //"CCoCodCode"
        System.out.println(stringSplosion("abc")); //"aababc"
        System.out.println(stringSplosion("ab")); //"aab"
    }

    public static String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i <= str.length(); i++){
            result.append(str.substring(0, i));
        }
        return result.toString();
    }
}
