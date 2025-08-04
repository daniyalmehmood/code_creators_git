public class MakeTags {

    public String applyTagToWord(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}