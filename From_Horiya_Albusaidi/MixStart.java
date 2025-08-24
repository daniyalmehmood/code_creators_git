public class MixStart {
    public static boolean mixStart(String str)
    {

        if(str.length()>=3)
        {
            String beginOfString=str.substring(1,3);
            if(beginOfString.equals("ix"))
            {
                return true;
            }
        }

        return false;
    }

}
