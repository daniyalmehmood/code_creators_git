public class NotString {
    public String ensureStringStartsWithNot(String str) {

        if (str.startsWith ( "not" )) {
            return str;
        }
        else {
            return "not "+str;
        }
    }
}
