public class JavaFundamental {
    public String buildGrowingString(String str) {
        StringBuilder str1=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            str1.append(str.substring(0,i+1));
        }
        return str1.toString();
    }


}