public class TRA458{  
public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday) {
            return true;
        } else if (vacation) {
            return true;
        }
        return false;
    }
	}