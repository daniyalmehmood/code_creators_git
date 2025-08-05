public class NonStart {
    public String concatWithoutFirstChar(String a, String b) {
        if (a.length() >= 1 && b.length() >= 1) {
            return a.substring(1) + b.substring(1);
        }
        return "";
    }
}




