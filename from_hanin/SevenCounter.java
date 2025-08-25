//Recursion-1 > count7
public class SevenCounter {
    public int countSevens(int n) {
        if (n == 0) {
            return 0;
        } else {
            int newnumber = n % 10;
            n /= 10;
            if (newnumber == 7) {
                return 1 + countSevens(n);
            } else {
                return 0 + countSevens(n);
            }
        }
    }

}

