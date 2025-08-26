import java.util.HashMap;
import java.util.Map;

public class WordCounter {//Map-2 > wordCount
    public static void main(String[] args) {
        System.out.println(countWords(new String[]{"a", "b", "a", "c", "b"}));// → {"a": 2, "b": 2, "c": 1}
        System.out.println(countWords(new String[]{"c", "b", "a"}));// → {"a": 1, "b": 1, "c": 1}
        System.out.println(countWords(new String[]{"c", "c", "c", "c"}));// → {"c": 4}
    }
    public static Map<String, Integer> countWords(String[] strings) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String str : strings){
            if(wordCounts.containsKey(str)){
                wordCounts.put(str, wordCounts.get(str) + 1);
            }
            wordCounts.put(str, 1);
        }
        return wordCounts;
    }
}