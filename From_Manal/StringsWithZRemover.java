   import java.util.List;
    public class StringsWithZRemover {
        // Remove strings containing "z"
        public List<String> removeStringsWithZ(List<String> words) {
            words.removeIf(s -> s.contains("z"));
            return words;
        }
    }