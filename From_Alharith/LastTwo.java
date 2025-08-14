public class LastTwo  {

    public String swapLastTwoChars(String str) {
        if (str.length()<2) return str;
        char last=str.charAt(str.length()-1);
        char end=str.charAt(str.length()-2);
        String word= str.substring (0,str.length()-2);
        return word+last+end;
    }

}
