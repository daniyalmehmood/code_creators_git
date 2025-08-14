public class AtFirst   {

    public String getFirstTwoOrPad(String str) {
        if (str.length()< 1) return "@@";

        if (str.length()<2) return str.substring (0,1)+"@";
        return str.substring (0,2);

    }

}
