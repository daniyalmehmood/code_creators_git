public class StringBit {
    public String stringBits(String str) {
        String result="";
        StringBuilder
        for(int i=0;i<str.length();i+=2)
        {
            result+=str.charAt(i);
        }
        return result;
    }

}