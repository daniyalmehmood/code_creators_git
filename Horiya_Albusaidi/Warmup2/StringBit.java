package Warmup2;

public class StringBit {
    public String stringBits(String str) {
        String newString="";

        for(int i=0;i<str.length();i+=2)
        {
            newString+=str.charAt(i);
        }
        return newString;
    }

}
