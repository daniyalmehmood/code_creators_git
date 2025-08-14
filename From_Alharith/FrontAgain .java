public class FrontAgain   {

    public boolean hasSameFrontAndBack(String str) {
        if (str.length()<2) return false;
        if (str.length()==2) return true;

        String front = str.substring(0,2);
        String end1=str.substring(str.length()-2);

        if (front.equals(end1)) return true;

        return false;

    }

}
