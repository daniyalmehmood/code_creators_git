public class HiExcluder {
    public int countHiExcludeX(String str) {
        if (str.length() < 2) {
            return 0;
        } else {

            if (str.length() >= 3 && str.substring(0, 3).equals("xhi")) {
                return countHiExcludeX(str.substring(3));
            }
            if (str.substring(0, 2).equals("hi")) {
                return 1 + countHiExcludeX(str.substring(2));
            } else {
                return countHiExcludeX(str.substring(1));
            }
        }
    }

}

