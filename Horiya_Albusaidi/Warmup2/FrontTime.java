package Warmup2;

public class FrontTime {
    public String frontTimes(String str, int n) {
        String result="";
        if(n>0)
        {
            if(str.length()>=3)
            {
                for(int i=0;i<n;i++)
                {
                    result+=str.substring(0,3);
                }
            }
            else
            {
                for(int i=0;i<n;i++)
                {
                    result+=str;
                }
            }
            return result;
        }
        else
            return "";
    }
}