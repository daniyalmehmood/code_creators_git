public class StartHi {
    public boolean startHi(String str) {
        if (str.length()<2)
            return false;
        String FT=str.substring(0,2);
        if(FT.equals("hi"))
            return true;
        return false;} }
