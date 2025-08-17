public class ArraySubsetChecker {
    public boolean isInnerSubsetOfOuter(int[]outer, int[]inner) {
        int countInnerInOuter = 0;
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < outer.length; j++) {
                if (outer[j] == inner[i]) {
                    countInnerInOuter++;
                    break;
                }
            }

        }
        return countInnerInOuter == inner.length;
    }
}