
public class FrontBack {

    public static String frontBack(String str)
    {
        if(str.isEmpty())  return "";
        char [] stringCharacters=str.toCharArray();
        int lengthOfString=str.length();
        int indexOfLastStringChar=lengthOfString-1;
        char firstChar=stringCharacters[0];
        char lastChar=stringCharacters[indexOfLastStringChar];

        if(lengthOfString<=1)
        {
            return str;
        }
        else
        {
            stringCharacters[0]=lastChar;
            stringCharacters[indexOfLastStringChar]=firstChar;
            return new String(stringCharacters);

        }
    }
}
