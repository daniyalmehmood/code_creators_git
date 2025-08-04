public class MakeOutWord {
    public String insertWordBetweenTags(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
}
