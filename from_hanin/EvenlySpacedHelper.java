public class EvenlySpacedHelper {
    public static boolean areEvenlySpaced(int a, int b, int c) {
        // Find small, medium, large by sorting
        int small = a;
        int medium = b;
        int large = c;

        // Swap to order small <= medium <= large
        if (small > medium) {
            int temp = small;
            small = medium;
            medium = temp;
        }
        if (medium > large) {
            int temp = medium;
            medium = large;
            large = temp;
        }
        if (small > medium) {
            int temp = small;
            small = medium;
            medium = temp;
        }

        // Check if the difference between small & medium equals medium & large
        return (medium - small) == (large - medium);
    }
}
