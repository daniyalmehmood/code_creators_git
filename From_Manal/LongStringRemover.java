   import java.util.List;
    public class  LongStringRemover {
        // Remove strings with length 4 or more
        public List<String> removeLongStrings(List<String> words) {
            words.removeIf(s -> s.length() >= 4);
            return words;
        }
    }