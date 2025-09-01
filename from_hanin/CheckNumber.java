public class CheckNumber {
    public boolean checkRaing(int n, boolean outsideMode) {
        if (outsideMode) {
            //return true if n is in the range 1..10, 
            return (n <= 1 || n >= 10);
        } else {
            return (n >= 1 && n <= 10);
        }
    }


}
