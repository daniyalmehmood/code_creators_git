// Array-3 > linearIn
public class ArrayInnerChecker {
    public boolean isInnerInOuter(int[] outer, int[] inner) {
        int innerIndex = 0;
        int outerIndex = 0;
        while (innerIndex < inner.length && outerIndex < outer.length) {
            if (inner[innerIndex] == outer[outerIndex]) {
                innerIndex++;
            } else if (inner[innerIndex] > outer[outerIndex]) {
                outerIndex++;
            } else { // inner[innerIndex] < outer[outerIndex]
                return false;
            }
        }
        return innerIndex == inner.length;
    }
}