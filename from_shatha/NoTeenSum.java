public class NoTeenSum {
    public static int sumIgnoringUnluckyTeens(int a, int b, int c) {
        if ((a >= 13 && a <= 19) && a != 15 && a != 16) {
            a = 0;
        }
        if ((b >= 13 && b <= 19) && b != 15 && b != 16) {
            b = 0;
        }
        if ((c >= 13 && c <= 19) && c != 15 && c != 16) {
            c = 0;
        }
        return a + b + c;
    }

    public static void main (String[] args){
        System.out.println(sumIgnoringUnluckyTeens(1,2,3));
        System.out.println(sumIgnoringUnluckyTeens(2,13,1));
        System.out.println(sumIgnoringUnluckyTeens(2,1,14));
    }
    }

