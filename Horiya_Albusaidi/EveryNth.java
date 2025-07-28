public class EveryNth {
    public static String everyNth(String str, int n)
    {
        StringBuilder newString = new StringBuilder();
        if(n>=1) {
            for (int i = 0; i < str.length(); i += n) {
                newString.append(str.charAt(i));
            }
            return newString.toString();
        }
        else throw new IllegalArgumentException("Invalid 'N' Value");

    }
}
