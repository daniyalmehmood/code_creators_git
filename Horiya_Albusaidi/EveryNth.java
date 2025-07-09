public class EveryNth {
    public static String everyNth(String str, int n)
    {
        String newString="";
        if(n>=1) {
            for (int i = 0; i < str.length(); i += n) {
                newString += str.charAt(i);
            }
            return newString;
        }
        else return "Invalid 'N' Value";
    }
}
