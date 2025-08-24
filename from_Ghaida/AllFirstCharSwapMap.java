import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllFirstCharSwapMap {//Map-2 > allSwap

    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapAllMatchingFirstChars(new String[]{"ab", "ac"})));// → ["ac", "ab"]
        System.out.println(Arrays.toString(swapAllMatchingFirstChars(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));// → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
        System.out.println(Arrays.toString(swapAllMatchingFirstChars(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));// → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
    }
    public static String[] swapAllMatchingFirstChars(String[] strings) {
        Map<Character, Integer> resultMap = new HashMap<>();//to store first occurrence
        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);
            if(resultMap.containsKey(firstChar)){
                int swapIndex = resultMap.get(firstChar);
                String currentString = strings[i];
                strings[i] = strings[swapIndex];
                strings[swapIndex] = currentString;
                resultMap.remove(firstChar);
            }
            else{
                resultMap.put(firstChar, i);
            }
        }
        return strings;
    }
}