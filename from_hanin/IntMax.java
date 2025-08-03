// Class to find the maximum of three integers
public class IntMax {

    // Method to return the largest of three integers
    public static int intMax(int a, int b, int c) {
        // If 'a' is greater than both 'b' and 'c', return 'a'
        if (a > b && a > c) {
            return a;
        }
        // If 'b' is greater than both 'a' and 'c', return 'b'
        else if (b > a && b > c) {
            return b;
        }
        // Otherwise, return 'c'
        else {
            return c;
        }
    }
}

