public class ArrayInclusionChecker {
    public boolean containsAll(int[] outerArray, int[] innerArray) {
        for (int i = 0; i < innerArray.length; i++) {
            boolean found = false;
            for (int j = 0; j < outerArray.length; j++) {
                if (innerArray[i] == outerArray[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
