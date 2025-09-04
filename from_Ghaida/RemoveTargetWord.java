import java.util.ArrayList;

public class RemoveTargetWord {//AP-1 > wordsWithout
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(wordsWithoutTarget(new String[]{"a", "b", "c", "a"}, "a"))); // → ["b", "c"]
        System.out.println(java.util.Arrays.toString(wordsWithoutTarget(new String[]{"a", "b", "c", "a"}, "b"))); // → ["a", "c", "a"]
        System.out.println(java.util.Arrays.toString(wordsWithoutTarget(new String[]{"a", "b", "c", "a"}, "c"))); // → ["a", "b", "a"]
    }
    public static String[] wordsWithoutTarget(String[] words, String target) {
        ArrayList<String> UnmatchedTargetList = new ArrayList<>();
        for (String word : words) {
            if (!word.equals(target)) {
                UnmatchedTargetList.add(word);
            }
        }
        return UnmatchedTargetList.toArray(new String[0]);
    }
}