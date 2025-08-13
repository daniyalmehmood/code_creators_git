public class SquirrelPartyEvaluator {
    public static boolean isPartySuccessful(int cigars, boolean isWeekend) {
        // If it's not the weekend, cigars must be between 40 and 60 inclusive.
        if(cigars>=40 && cigars<=60 && !isWeekend)
        {
            return true;
        }

        else if((isWeekend) && (cigars>=40)){return true; }
        return false;
    }
}
