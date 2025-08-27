public class ArrayPairMaker {
    public int[] buildTwoElementArray(int[] a, int[] b) {
        int[] newArray = new int[2];
        int index = 0;
        for (int i = 0; i < a.length && index < 2; i++) {
            newArray[index] = a[i];
            index++;
        }
        for (int i = 0; i < b.length && index < 2; i++) {
            newArray[index] = b[i];
            index++;
        }
        return newArray;
    }
}
