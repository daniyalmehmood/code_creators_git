public class InnerInOuter {//Array-3 > linearIn
    public static void main(String[] args) {
        System.out.println(isInnerInOuter(new int[]{1, 2, 4, 6}, new int[]{2, 4}));// → true
        System.out.println(isInnerInOuter(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));// → false
        System.out.println(isInnerInOuter(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));// → true
    }
    public static boolean isInnerInOuter(int[] outer, int[] inner) {
        int i = 0; //index of outer
        int j = 0; //index of inner

        while (i < outer.length && j < inner.length) {
            if (outer[i] < inner[j]) {
                i++; //current outer element is too small
            }
            else if (outer[i] > inner[j]) {
                return false; //current outer element is too big
            }
            else {
                i++;  // outer[i] == inner[j]
                j++;  // advance inner since we found a match
            }
        }

        // If we made it through the inner array, then all elements of inner were found in outer
        return j == inner.length;
    }
}