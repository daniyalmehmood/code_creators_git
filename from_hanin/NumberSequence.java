//Array-2 > fizzArray3
public class NumberSequence {

    public static int[] buildArray(int start, int end) {
        int newlength = end - start;
        int[] newArray = new int[newlength];

        for (int i = 0; i < newlength; i++) {
            newArray[i] = start + i;
        }

        return newArray;
    }

}
