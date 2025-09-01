//Array-3 > linearIn
public class ArraySubsetChecker {
    public boolean containsAllElements(int[] outer, int[] inner) {
        int j = 0;
        for (int i = 0; i < outer.length && j < inner.length; i++) {
            if (outer[i] == inner[j]) {
                j++; // move to next inner element when match is found
            }
        }

        if (j == inner.length) {
            return true;
        } else {
            return false;
        }
    }
}
