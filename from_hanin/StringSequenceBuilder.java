//Array-2 > fizzArray2
public class StringSequenceBuilder {
    public static String[] makeStringArray(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = String.valueOf(i);
        }
        return result;
    }

}
