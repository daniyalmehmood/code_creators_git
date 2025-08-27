public class CloseToTen {

    public static int close10(int a, int b) {

        int aAbs = Math.abs(a -10);
        int bAbs = Math.abs(b -10);

        if(aAbs < bAbs){

            return a;


        }else if (bAbs < aAbs)
        {

            return b;

        }return 0;



    }

    public static void main(String[] args) {
        System.out.println(close10(10,100));

    }

}
