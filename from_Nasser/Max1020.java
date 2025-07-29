public class Max1020 {

        public static int max1020(int a, int b){

            if (a<10 || a>20) a=0;
            if (b<10 || b>20) b=0;

    return Math.max(a, b);
                
    }


    public static void main(String[] args){

        System.out.println(max1020(11,19));
        System.out.println(max1020(19,11));
        System.out.println(max1020(11,9));
    }
}
