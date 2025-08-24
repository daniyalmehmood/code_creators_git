//Array-3 > linearIn
public class LinearInCheck {
    public static boolean linearIn(int[] outer, int[] inner) {
        int i = 0; // pointer for outer array
        int j = 0; // pointer for inner array

        // Loop until we reach the end of either array
        while (i < outer.length && j < inner.length) {
            if (outer[i] < inner[j]) {
                // Move forward in outer until we catch up to inner[j]
                i++;
            } else if (outer[i] == inner[j]) {
                i++;
                j++;
            } else {
                return false;
            }
        }
        return j == inner.length;
    }

    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
    }
}