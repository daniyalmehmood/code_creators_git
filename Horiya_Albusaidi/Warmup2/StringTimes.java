package Warmup2;
public class StringTimes {
    public String stringTimesResult(String str, int n) {
        String result = "";
        if(n>=0 && !str.isEmpty())
        {
            for(int i=0;i<n;i++)
            {
                result+=str;
            }
            return result;
        }
        else
            return "";

    }
}
