public class zipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap")); //"zpXzp"
        System.out.println(zipZap("zopzop")); //"zpzp"
        System.out.println(zipZap("zzzopzop")); //"zzzpzp"
    }
    public static String zipZap(String str) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
                newString.append(str.charAt(i));
                newString.append(str.charAt(i+2));
                i+= 2;
            }
            else {
                newString.append(str.charAt(i));
            }
        }
        return newString.toString();
    }
}
