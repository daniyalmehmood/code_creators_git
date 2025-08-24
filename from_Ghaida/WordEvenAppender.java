import java.util.HashMap;
import java.util.Map;

public class WordEvenAppender {//Map-2 > wordAppend

    public static void main(String[] args) {
        System.out.println(appendEverySecondOccurrence(new String[]{"a", "b", "a"}));// → "a"
        System.out.println(appendEverySecondOccurrence(new String[]{"a", "b", "a", "c", "a", "d", "a"}));// → "aa"
        System.out.println(appendEverySecondOccurrence(new String[]{"a", "", "a"}));// → "a"
    }
    public static String appendEverySecondOccurrence(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        int countOccurenceOfWord = 0;
        for(String word : strings){
            if(map.containsKey(word)){
                countOccurenceOfWord = map.get(word) + 1;//if word exists
            }
            else {
                countOccurenceOfWord = 1;
            }
            map.put(word, countOccurenceOfWord);
            if(countOccurenceOfWord % 2 == 0){
                result.append(word);
            }
        }
        return result.toString();
    }
}