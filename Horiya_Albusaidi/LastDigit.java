public class LastDigit {
   public static Boolean lastDigit(int a, int b)
    {
        int lastDigitOfA = a % 10;
        int lastDigitOfB = b % 10;
        if(lastDigitOfA==lastDigitOfB)
            return true;
        else
            return false;
    }
}
