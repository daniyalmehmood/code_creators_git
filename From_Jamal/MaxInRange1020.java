public class MaxInRange1020 {
    public static int max1020(int a, int b) {

        int  isMax = Math.max(a,b);
        if(a < 10 && b > 20 || b < 10 && a > 20)return 0;

        if (a > 20 )return b;
        if (b > 20 )return a;

        if (isMax >= 10 && isMax <= 20){

            return isMax;

        } else return 0 ;


    }

    public static void main(String[] args) {
        System.out.println(max1020(21,9));
    }
}
