public class AloneTeenager {
    public static boolean loneTeen(int a, int b) {

        if ((a <=19 && a >=13) && (b <=19 && b >=13) || (a == b) ){

            return false;



        }else return true;


    }

    public static void main(String[] args) {
        System.out.println(loneTeen(100,100));
        System.out.println(loneTeen(15,20));
    }
}
