public class SmileLogic {
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if (!aSmile && bSmile){

            return false;


        } else if (aSmile && ! bSmile) {

            return false;

        }else return true;


    }


    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true,true));
        System.out.println(monkeyTrouble(false,false));
        System.out.println(monkeyTrouble(true,false));
    }

}
