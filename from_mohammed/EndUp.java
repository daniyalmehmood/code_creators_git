public class EndUp {
    public String endUp(String str) {

        if (str.length()<=3)
            return str.toUpperCase();

        int cap=str.length()-3;
        String frnt=str.substring(0,cap);
        String bck=str.substring(cap);
        return frnt+bck.toUpperCase();
    }
}
