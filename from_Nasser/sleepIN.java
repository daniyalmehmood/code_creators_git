public class sleepIN {


    public static boolean canSleep(boolean weekDay, boolean vacation) {

        if (!weekDay  || vacation ) {

            return true;
        } 
        else {
            return false;
        }
    }


    public static void main(String[] args){

        System.out.println("can sleep in a vacation\t" + canSleep(false,true));
        System.out.println("can sleep in a vacation\t" + canSleep(true ,true));
        System.out.println("work day\t" + canSleep(true ,false));
        System.out.println("we can sleep in the weekends\t" + canSleep(false ,false));
    }
}






