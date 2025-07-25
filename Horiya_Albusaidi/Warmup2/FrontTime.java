package Warmup2;

public class FrontTime {
    public String frontTimes(String str, int n) {
        String newString="";
        if(n>0)
        {

            if(str.length()>=3)
            {
                for(int i=0;i<n;i++)
                {
                    newString+=str.substring(0,3);
                }
            }
            else
            {
                for(int i=0;i<n;i++)
                {
                    newString+=str;
                }
            }
            return newString;
        }
        else
            return "";
    }
}