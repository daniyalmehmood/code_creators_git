public class JavaFundamental {
    public String buildGrowingString(String str) {
        String str1="";
        for (int i = 0; i < str.length(); i++) {
            str1=str1+str.substring(0,i+1);
        }
        return str1.toString();
    }


}