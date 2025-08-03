public class FirstTwo {

    public String firstTwo(String str) {
        if(str.isEmpty())return "";
        if(str.length()<2)return str;
        String first2=str.substring(0,2);
        return first2;



    }

}
