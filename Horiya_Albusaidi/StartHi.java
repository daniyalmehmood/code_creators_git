public class StartHi {
    public static Boolean startHi(String str)
    {
        String checkHiString=str.substring(0,2);
        String toLowerString=checkHiString.toLowerCase();
        if(toLowerString.equals("hi"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
