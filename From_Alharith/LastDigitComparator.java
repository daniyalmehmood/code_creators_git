public class LastDigitComparator  {

    public boolean hasMatchingLastDigit(int a, int b, int c) {
        if (a<0 || b<0 || c<0) return false;
        int modA= a%10;
        int modB= b%10;
        int modC= c%10;
        if ((modA == modB) || (modA == modC) || (modB==modC)) return true;
        return false;
    }

}
