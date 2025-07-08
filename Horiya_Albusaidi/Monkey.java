public class Monkey {
    public static  Boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
        boolean result;
        if(aSmile && bSmile) result=true;
        else if (!aSmile && !bSmile) {
            result = true;
        }
        else result = false;
        return result;
    }
}
