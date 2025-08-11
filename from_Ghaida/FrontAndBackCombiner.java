public class FrontAndBackCombiner {
    public static void main(String[] args){
        System.out.println(combineFrontAndBack("Hello", 2)); // → "Helo"
        System.out.println(combineFrontAndBack("Chocolate", 3));// → "Choate"
        System.out.println(combineFrontAndBack("Chocolate", 1)); // → "Ce
    }
    public static String combineFrontAndBack(String str, int n) {
        if(str.length() > 2){
            return str.substring(0, n) + str.substring(str.length() - n);
        }
        return str;
    }
}
