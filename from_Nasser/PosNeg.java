public class PosNeg {

    public static boolean posNeg(int a, int b, boolean negative) {

        if (a > 0 && b < 0 && !negative ) {
            return true;


        } else if (a < 0 && b > 0 && !negative )
            return true;

        else if (a < 0 && b < 0 && negative ){
            return true;
    }
        else{
            return false;}

    }

    public static void main(String[] args){

        System.out.println("case1\t"+posNeg(1,-1,false));
        System.out.println("case2\t"+posNeg(-1,1,false));
        System.out.println("case3\t"+posNeg(-1,-1,true));
    }
    }

