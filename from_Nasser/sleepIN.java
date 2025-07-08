public class sleepIN {


    public static boolean canSleep(boolean weekDay, boolean vacation) {

        if (weekDay == false || vacation == true) {
            System.out.println("we can sleep on a vacation");
            return true;
        } else if (weekDay == true || vacation == false) {
            System.out.println("we cannot");
            return false;
        } else if (weekDay == true || vacation == true) {
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args){

        System.out.println("can sleep in a vacation" + canSleep(false,true));
        System.out.println("can sleep in a vacation" + canSleep(true ,true));
        System.out.println("work day" + canSleep(true ,false));
        System.out.println("we can sleep in the weekends" + canSleep(false ,false));
    }
}






