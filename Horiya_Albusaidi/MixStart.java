public class MixStart {
    public static Boolean mixStart(String str)
    {
        String beginOfString=str.substring(1,3);
        if(beginOfString.equals("ix"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
