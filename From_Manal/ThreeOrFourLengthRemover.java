   import java.util.List;
    public class  ThreeOrFourLengthRemover {
        // Remove strings of length 3 or 4
        public List<String> removeLength3Or4(List<String> words) {
            words.removeIf(s -> s.length() == 3 || s.length() == 4);
            return words;
        }
    }