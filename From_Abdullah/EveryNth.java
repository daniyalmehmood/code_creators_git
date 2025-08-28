public class EveryNth {
    public String extractEveryNthChar(String str, int n) {

        String finalword = "";
        for (int i = 0 ; i < str.length () ; i+=n ) {
            finalword += str.charAt(i);
        }
        return finalword;
    }
}
