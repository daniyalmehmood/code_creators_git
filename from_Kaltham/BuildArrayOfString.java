public class BuildArrayOfString {
    public String[]buildStringArrayUpToN(int n) {
        String[]newArray = new String[n];
        for (int i = 0; i < n; i++) {
            String indexToString = String.valueOf(i);
            newArray[i] = indexToString;
        }
        return newArray;
    }
}