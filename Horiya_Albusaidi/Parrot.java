public class Parrot {
    public  static Boolean parrotTrouble(boolean talking, int hour)
    {
        boolean result;
        if(talking && (hour<7 || hour>20 )) result = true;
        else result = false;
        return result;
    }
}
