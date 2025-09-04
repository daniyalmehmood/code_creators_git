   import java.util.List;
    public class  YAdderAndYYRemover {
        // Add 'y' to each string, then remove if it contains "yy"
        public List<String> addYThenRemoveYY(List<String> words) {
            words.replaceAll(s -> s + "y");
            words.removeIf(s -> s.contains("yy"));
            return words;
        }
    }