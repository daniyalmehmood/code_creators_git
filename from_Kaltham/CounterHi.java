//Recursion-1 > countHi

public class CounterHi {
    public int countHiInString(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHiInString(str.substring(n + 2));
        } else {

            return countHiInString(str.substring(1));
        }
    }

}