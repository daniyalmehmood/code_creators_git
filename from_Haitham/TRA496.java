public class TRA496{
public static int diff21(int n) {
        int diff = 0;
        if (n <= 21) {
            diff = 21 - n;
        } else if (n > 21) {
            diff = 2 * (n - 21);
        }
        return diff;

    }
	}