package Warmup2;

public class AltPairs {
    public String altPairs(String str) {
        int count =0;
        String result="";
        for(int i=0;i<str.length();i++)
        {
            if(count<=1)
            {
                result+=str.substring(i,i+1);
                count++;
            }
            else
            {
                i=i+1;
                count=0;
            }
        }
        return result;
    }

}
