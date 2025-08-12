public class AltPairs {
    public String altPairs(String str) {
        StringBuilder Finalstr = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            Finalstr.append(str.charAt(i));
            if (i + 1 < str.length()) {
                Finalstr.append(str.charAt(i + 1));
            }
        }
        return Finalstr.toString();
    }

}