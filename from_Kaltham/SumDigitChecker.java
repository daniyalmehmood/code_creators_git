//Logic-1 > sumLimit


public class SumDigitChecker {
    public int limitedSum(int a, int b) {
        int sum = a + b;
        int lengthOfSum = (String.valueOf(sum)).length();
        int lengthOfA = (String.valueOf(a)).length();
        if (lengthOfSum == lengthOfA) {
            return sum;
        }
        return a;
    }
}