package Warmup2;

public class stringYak {
    public static String stringYak(String str) {
        String result="";
        int[] index=new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            if (i+2<str.length() && str.charAt(i) == 'y' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 'k') {
                i=i+2;

            }
            else
            {
                result=result+str.charAt(i);
            }
        }


        return result;
    }


}
