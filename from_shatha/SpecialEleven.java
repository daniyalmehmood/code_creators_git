public class SpecialEleven {
    public static boolean isSpecialEleven(int n) {
        return (n % 11 ==0 || n % 11==1);
    }

    public static void main (String[] args){
        System.out.println(isSpecialEleven(22));
        System.out.println(isSpecialEleven(23));
        System.out.println(isSpecialEleven(24));
    }


}
