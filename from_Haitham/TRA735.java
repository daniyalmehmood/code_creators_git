public class TRA735{
public static boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b < 13 || b > 19)) {
            return true;
        } else if ((a < 13 || a > 19) && (b >= 13 && b <= 19)) {
            return true;
        } else return false;
    }
	}