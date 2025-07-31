public class XyBalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby")); //true
        System.out.println(xyBalance("aaxbb")); //false
        System.out.println(xyBalance("yaaxbb")); //false
    }
    public static boolean xyBalance(String str) {
        if(str.length() == 1){
            if(str.charAt(0) == 'y'){
                return true;
            }
            else{
                return false;
            }
        }
        if(str == ""){
            return true;
        }
        for (int i = str.length()- 1; i > 0; i--) {
            if (str.charAt(i) == 'x') {
                return false;
            }
            if (str.charAt(i) == 'y') {
                return true;
            }
        }
        return true;
    }
}
