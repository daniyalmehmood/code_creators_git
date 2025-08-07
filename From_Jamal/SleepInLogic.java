public class SleepInLogic {


    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if (weekday && vacation){

            return true;


        } else if (weekday && ! vacation){

            return false;


        }else return true;

        }

    public static void main(String[] args) {
        System.out.println(sleepIn(false,false));
        System.out.println(sleepIn(true,false));
        System.out.println(sleepIn(true,true));
    }

    }



