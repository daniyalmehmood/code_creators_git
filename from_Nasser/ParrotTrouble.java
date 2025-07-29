public class ParrotTrouble {

    public static boolean parrotTrouble(boolean talking, int hour){

        if( talking && (7>hour||hour>20)) {

            return true;
        }
            else{
            return false;
        }

    }
    public static void main(String[] args){

        System.out.println(parrotTrouble(true,6));
        System.out.println(parrotTrouble(true,7));
        System.out.println(parrotTrouble(false,6));
    }
}
