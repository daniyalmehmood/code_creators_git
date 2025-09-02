// Recursion-1 > countHi
public class HiStringCounter {
    public int countSubstringHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countSubstringHi(str.substring(1));
        }
        return countSubstringHi(str.substring(1));
    }
}