public class StringE {
    public static Boolean stringE(String str)
    {
        int stringLength = str.length();
        int counter=  0;

        for (int i = 0; i <stringLength-1; i++)
        {
            if(str.charAt(i)=='e') counter++;

        }
        if(counter>3 || counter==0) {
            return false;
        } else return true;

    }
}
