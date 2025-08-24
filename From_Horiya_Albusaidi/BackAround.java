public class BackAround {
    public static String backAround(String str)
    {
        int lengthOfString=str.length();
        char lastChar=str.charAt(lengthOfString-1);
        return lastChar+str+lastChar;
    }
}
