public class ModuloElevenChecker {
    public static void main(String[] args) {
        System.out.println(isModuloElevenSpecial(22));// → true
        System.out.println(isModuloElevenSpecial(23));// → true
        System.out.println(isModuloElevenSpecial(24));// → false
    }
    public static boolean isModuloElevenSpecial(int n) {
        int remainder = n % 11 ;
        if(remainder == 0 ||remainder == 1){
            return true;
        }
        return false;
    }
}
