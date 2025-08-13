public class SleepDecision  {

    public boolean canSleepIn (boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
}
