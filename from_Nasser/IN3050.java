public class IN3050 {

    public static boolean in3050( int a, int b){

        if ( ((a>=30 && a<=40) && (b>=30 && b<=40))){

            return true;
        }
        else if (((a>=40 && a<=50) && (b>=40 && b<=50))) {
            return true;

        }
        else return false;
    }

    public static void main(String[] args){

        System.out.println(in3050(30,31));
        System.out.println(in3050(30,41));
        System.out.println(in3050(40,50));


    }

}
