public class Front3 {

    public static String front3(String str)
    {
        StringBuilder builder=new StringBuilder();
        String firstThreeChar="";
        if(str.length()>=3)
        {
            firstThreeChar=str.substring(0,3);
            for(int i=0;i<3;i++)
            {
                builder.append(firstThreeChar);
            }
            return builder.toString();

        }
        else  return str;
    }
}
