public class StringSplosion {
    public static String stringSplosion(String str) {
        String newStr = "";
        for (int i =0; i<str.length(); i++){
            newStr = newStr + str.substring(0, i+1);
        }
        return newStr;
    }

    public static void main(String[] args){
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }
}
