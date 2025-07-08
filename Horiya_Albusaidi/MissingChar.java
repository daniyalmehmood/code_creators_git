public class MissingChar {
    public static String missingChar(String str, int n)
    {
        StringBuilder modifiedString=new StringBuilder(str);

        if(n>=0 && n<str.length())
        {
            modifiedString.deleteCharAt(n);
            return modifiedString.toString();
        }
        else return "The value of second param is not valid";

    }
}
