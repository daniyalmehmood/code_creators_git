//Array-3 > linearIn
public class ArrayContains {
    public boolean innerElementsExistInOuter(int[] outer, int[] inner) {
        int innerIndex = 0;
        int outerIndex = 0;

        while (innerIndex < inner.length && outerIndex < outer.length) {
            if (inner[innerIndex] == outer[outerIndex]) {
                innerIndex++;
            }
            outerIndex++;
        }
        return innerIndex == inner.length;
    }
}