// Array-2 > fizzArray3
public class SequenceMaker {
    public int[] sequenceFromStartUpToWithoutEnd(int start, int end) {
        int size = end - start;
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = start + i;
        }
        return newArray;
    }

}