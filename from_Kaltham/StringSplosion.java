public class StringSplosion {
    public String buildGrowingString(String str) {
        StringBuilder Finalstr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Finalstr.append(str.substring(0, i + 1));
        }
        return Finalstr.toString();
    }

}