public class SpecialEleven {
    public static boolean isSpecialNumber (int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public static void main(String[] args){
        System.out.println(isSpecialNumber(22));
        System.out.println(isSpecialNumber(23));
        System.out.println(isSpecialNumber(24));
    }
}
