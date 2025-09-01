public class HiTracker {
    public int trackHiCount(String str) {
        if (str.length() == 1 || str.equals("")) {
            return 0;
        } else {
            String firstTwo = str.substring(0, 2);
            str = str.substring(1);
            if (firstTwo.equals("hi")) {
                return 1 + trackHiCount(str);
            } else {
                return 0 + trackHiCount(str);
            }
        }
    }
}


