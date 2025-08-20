public class CreateArray {
    public static int[] arrayMadeOfMiddleElementOfAnotherArrays(int[] a, int[] b) {
        int[] middleWayArray = new int[2];
        middleWayArray[0] = a[1];
        middleWayArray[1] = b[1];
        return middleWayArray;
    }
}
