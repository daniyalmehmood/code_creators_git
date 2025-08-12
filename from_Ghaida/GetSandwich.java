public class GetSandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread")); //"jam"
        System.out.println(getSandwich("xxbreadjambreadyy")); //"jam"
        System.out.println(getSandwich("xxbreadyy")); //""
    }

    public static String getSandwich(String str) {
        int firstbread = str.indexOf("bread");
        int lastbread = str.lastIndexOf("bread");
        for (int i = 0; i < str.length() - 5; i++) {
            if(firstbread >= 0 && lastbread >= 0 && firstbread != lastbread){
                return str.substring(firstbread + 5, lastbread);
            }
        }
        return "";
    }
}