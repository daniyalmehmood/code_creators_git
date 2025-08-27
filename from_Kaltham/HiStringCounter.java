//Recursion-1 > countHi2

public class HiStringCounter {
    public int countHiExcludingX(String str) {
        if (str.length() <= 1) {
            return 0;
        }

        if (str.length() > 2 && str.substring(0, 3).equals("xhi")) {
            return countHiExcludingX(str.substring(3));
        }
        if (str.length() > 1 && str.substring(0, 2).equals("hi")) {
            return 1 + countHiExcludingX(str.substring(2));
        }

        return countHiExcludingX(str.substring(1));

    }
}