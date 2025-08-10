public class TeenIdentify {
    public static boolean hasTeen(int a, int b, int c) {




        if( (a <=19 && a >=13) || (b <=19 && b >=13 ) || (c >=13 && c <= 19)){

            return true;




        }else return false;






    }

    public static void main(String[] args) {
        System.out.println(hasTeen(10,12,1));
        System.out.println(hasTeen(13,16,19));

    }

}
