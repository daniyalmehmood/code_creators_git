public class SleepIn {

    public boolean shouldSleepInToday(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        }
        else
            return false;
    }

}
