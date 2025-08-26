public class LastTwoSwapper {
    public static void main(String[] args) {
        System.out.println(swapLastTwo("coding")); //codign
        System.out.println(swapLastTwo("cat")); //cta
        System.out.println(swapLastTwo("ab")); //ba
    }
    public static String swapLastTwo(String str){
        if(str.length() < 2){
            return str;
        }
        return str.substring(0, str.length() - 2) + str.charAt(str.length()-1) + str.charAt(str.length()-2) ;
    }
}
