public class ExtraFront {
    public static void main(String[] args) {
        System.out.println(extraFront("Hello")); //"HeHeHe"
        System.out.println(extraFront("ab")); //"ababab"
        System.out.println(extraFront("H")); //"HHH"
    }
    public static String extraFront(String str) {
        if(str.length() > 2){
            String index12 = str.substring(0, 2);
            return index12 + index12 + index12;
        }
        return str + str + str;
    }
}
