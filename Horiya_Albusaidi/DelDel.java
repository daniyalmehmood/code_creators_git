public class DelDel {
    public static String  delDel(String str)
    {
        if(str.isEmpty()) return " ";
        if(str.length()>=4)
        {
            String checkDel=str.substring(1,4);
            if(checkDel.equals("del"))
            {
                return str.charAt(0)+str.substring(4);
            }
        }
        return str;

    }
}
