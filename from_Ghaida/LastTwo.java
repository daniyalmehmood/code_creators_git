public class LastTwo {
    public static void main(String[] args) {
        System.out.println(lastTwo("coding")); //codign
        System.out.println(lastTwo("cat")); //cta
        System.out.println(lastTwo("ab")); //ba
    }
    public static String lastTwo(String str){
        if(str.length() < 2){
            return str;
        }
        return str.substring(0, str.length() - 2) + str.charAt(str.length()-1) + str.charAt(str.length()-2) ;
    }
}
