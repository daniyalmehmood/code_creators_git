public class StringTimes  {
    public String repeatStringNTimes(String str, int n) {
        n = Math.abs(n);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }
}
