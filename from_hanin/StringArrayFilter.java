import java.util.ArrayList;

public class StringArrayFilter {
    public String[] removeTargetStrings(String[] words, String target) {
        ArrayList<String> newList = new ArrayList<String>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                continue;
            }
            newList.add(words[i]);
        }

        String[] result = new String[newList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = newList.get(i);
        }

        return result;
    }

}
