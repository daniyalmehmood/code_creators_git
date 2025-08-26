public class ArrayEndsChecker {
    public static boolean firstAndLastElementChecker(int[] a, int[] b) {
        if (a[0]==b[0]||a[a.length-1]==b[b.length-1]){ // check either the first elements are equal Or Last elements are equal in both arrays
            return true; // there is equality
        }
        return false; // no equality in arrays
    }
    public static void main (String[] args){
        System.out.println(firstAndLastElementChecker(new int[]{1, 2, 3} ,new int[]{7, 3}));
        System.out.println(firstAndLastElementChecker(new int[]{1, 2, 3} ,new int[]{7, 3, 2}));
    }
}
