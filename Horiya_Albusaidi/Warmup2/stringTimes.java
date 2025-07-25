package Warmup2;

public class stringTimes {
    public String stringTimesResult(String str, int n) {
        String newString="";
        if(n>=0 && !str.isEmpty())
        {
            for(int i=0;i<n;i++)
            {
                newString+=str;
            }
            return newString;
        }
        else
            return "";

    }
}
