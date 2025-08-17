public class OldThreeOrFive  {

    public boolean isDivisibleByThreeOrFiveOnly(int n) {
        if (n%5==0 && n%3==0) return false;
        if (n%5==0 || n%3==0) return true;
        return false;
    }

}
