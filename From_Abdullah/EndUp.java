public class EndUp {
    public String capitalizeLastThree(String str) {

        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        int snipping = str.length()-3;  // cut

        String front = str.substring (0,snipping);
        String back = str.substring(snipping);

        return front + back.toUpperCase();
    }

}
