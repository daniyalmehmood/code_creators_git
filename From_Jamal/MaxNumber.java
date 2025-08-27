public class MaxNumber {


    public static int intMax(int a, int b, int c) {

        int maxNum = Math.max(a,b);
        int maxNum2 = Math.max(b,c);
        int maxNum3 = Math.max(a,c);

        int max = Math.max(a,Math.max(b,c));



        return max;




    }

    public static void main(String[] args) {

        System.out.println(intMax(1,4,9));


    }


}
