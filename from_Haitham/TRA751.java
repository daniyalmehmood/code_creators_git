public class TRA751{
    public static int close10(int a, int b) {
        if (Math.abs(10 - a) == Math.abs(10 - b)) {
            return 0;
        } else if (Math.abs(10 - a) < Math.abs(10 - b)) {
            return a;
        } else return b;
    }
	}