public class HasBad {

    public boolean hasBad(String str) {
        if (str.length() < 3 || str.isEmpty() ) return false;
        if(str.length()==3 && str.substring(0, 3).equals("bad")){
            return true;
        } else if (str.length() == 3 &&! str.substring(0, 3).equals("bad")) {
            return false;

        }

        if (str.substring(1, 4).equals("bad") || str.substring(0, 3).equals("bad")) {
            return true;
        } else return false;
    }
}



