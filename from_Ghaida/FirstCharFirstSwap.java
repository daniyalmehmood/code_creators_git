import java.util.*;

public class FirstCharFirstSwap {//Map-2 > firstSwap

    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapFirstOccurrences(new String[]{"ab", "ac"})));// → ["ac", "ab"]
        System.out.println(Arrays.toString(swapFirstOccurrences(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})));// → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
        System.out.println(Arrays.toString(swapFirstOccurrences(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"})));// → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
    }
    public static String[] swapFirstOccurrences(String[] strings) {
        Map<Character, Integer> firstIndex = new HashMap<>(); // stores first occurrence
        Set<Character> swappedLetters = new HashSet<>(); // stores letters already swapped
        for (int i = 0; i < strings.length; i++) {
            char character = strings[i].charAt(0);
            if (swappedLetters.contains(character)) {
                continue; //skip if already swapped
            }
            else if (firstIndex.containsKey(character)) {
                int firstOccurrenceIndex = firstIndex.get(character);
                String temp = strings[i];//to store first occurrence
                strings[i] = strings[firstOccurrenceIndex];
                strings[firstOccurrenceIndex] = temp;
                swappedLetters.add(character); // mark as swapped
            }
            else {
                firstIndex.put(character, i); // store first occurrence
            }
        }
        return strings;
    }
}