public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        int middelOfOut = out.length() / 2;
        return out.substring(0, middelOfOut) + word + out.substring(middelOfOut);
    }

}
