public class FirstTwo  {

    public String getFirstTwoChars(String str) {
        if (str.length()<2) return str;
        return str.substring(0,2);
    }

}
