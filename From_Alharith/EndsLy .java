public class EndsLy   {

    public boolean endsWithLy(String str) {
        if (str.length()<2) return false;
        if ((str.substring(str.length()-2)).equals("ly")) return true;
        return false;
    }

}
