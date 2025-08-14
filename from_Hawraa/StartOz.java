public class StartOz{
 public static String startOz(String str) {
        String newStr = ""; 
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            newStr += str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            newStr += str.charAt(1);
        }
        return newStr;
    }
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias")); 
        System.out.println(startOz("bzoo"));       
        System.out.println(startOz("oxx"));        
    }
}