package Warmup2;

public class StringSplosion {
    public String stringSplosion(String str) {
        String result="";
        char fristChar=' ';
     
        if(str.isEmpty())
            return "";
        else
        {
            fristChar=str.charAt(0);//c

            for(int i=1;i<str.length();i++)//i=2
            {
                result+=str.substring(0,i+1);
            }

        }
        return String.valueOf(fristChar)+result;
    }

}
