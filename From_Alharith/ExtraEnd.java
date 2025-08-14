public class ExtraEnd  {

    public String repeatLastTwoChars(String str) {
        if (str.length()<2) return str;
        String last = str.substring(str.length()-2);
        return last +last+last;
    }

}
