// Class for creating HTML tags
public class HtmlTagMaker {

    // Wraps a word with the given HTML tag
    public String createTag(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
