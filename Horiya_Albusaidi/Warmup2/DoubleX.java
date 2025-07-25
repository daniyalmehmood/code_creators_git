package Warmup2;

public class DoubleX {
    boolean doubleX(String str) {

        for(int i=0;i<str.length()-1;i++)
        {

            if(str.charAt(i)=='x' )
            {
                if(str.charAt(i)==str.charAt(i+1))
                    return true;
                else
                    return false;
            }


        }
        return false;
    }

}
