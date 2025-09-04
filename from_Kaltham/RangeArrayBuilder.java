public class RangeArrayBuilder {
    public int[]buildArrayFromStartUpToEnd(int start, int end) {
        int lengthofArray = end - start;
        int[]newArray = new int[lengthofArray];
        for (int i = 0; i < lengthofArray; i++) {
            newArray[i] = start + i;
        }
        return newArray;
    }
}