public class ArrayBuilder {
    public int[]buildArrayUpToN(int n) {
        int[]newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = i;
        }
        return newArray;
    }
}