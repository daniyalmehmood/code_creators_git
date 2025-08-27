import java.util.regex.Pattern;

public class StringRemover {
    public static String removeRemovedString(String base, String remove) {
        return base.replaceAll("(?i)" + Pattern.quote(remove), "");
    }
}
