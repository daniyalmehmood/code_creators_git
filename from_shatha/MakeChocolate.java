public class MakeChocolate {
    public static int calculateSmallBars(int small, int big, int goal) {
        int usebig = goal / 5;
        if (usebig > big) {
            usebig = big;
        }

        int left = goal - usebig * 5;

        if (small >= left) {
            return left;
        }

        return -1;
    }
    public static void main (String[]args){
        System.out.println(calculateSmallBars(4,1,9));
        System.out.println(calculateSmallBars(4,1,10));
        System.out.println(calculateSmallBars(4,1,7));
    }

}
