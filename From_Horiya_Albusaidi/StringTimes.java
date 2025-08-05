public class StringTimes {
    public String repeatStringNTimes(String str, int n) {
        if (n >= 0 && !str.isEmpty()) {
            return str.repeat(n);
        } else
            return "";

    }
}
