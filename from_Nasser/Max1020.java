public class Max1020 {

        public static int max1020(int a, int b){

            if( (a>=10 && a<=20 ) && (b>=10 && b<=20)){

                if ( a>b ){
                    return a;
                }
                else return b;
            }
            else return 0;
    }


    public static void main(String[] args){

        System.out.println(max1020(11,19));
        System.out.println(max1020(19,11));
        System.out.println(max1020(11,9));
    }
}
