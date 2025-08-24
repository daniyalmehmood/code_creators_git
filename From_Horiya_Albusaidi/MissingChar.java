public class MissingChar {
    public static String missingChar(String str, int n)
    {
        StringBuilder modifiedString=new StringBuilder(str);
        if (str == null) {
            return "The input string cannot be null";
        }
        if(n>=0 && n<str.length())
        {
            modifiedString.deleteCharAt(n);
            return modifiedString.toString();
        }
        else return "Invalid index: must be between 0 and " + (str.length() - 1)

    }
}
