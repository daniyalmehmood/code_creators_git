public class StringSplosion {
    public String explodeString(String str) {
        StringBuilder newString = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) {
            newString.append(str.substring(0, i));
        }
        return newString.toString();
    }
}