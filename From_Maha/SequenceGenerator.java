//Array-2 > fizzArray
public class SequenceGenerator {
    public int[] generateSequence(int n) {
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = i;
        }
        return newArray;
    }
}
