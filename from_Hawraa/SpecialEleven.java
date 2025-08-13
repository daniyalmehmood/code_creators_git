public class SpecialEleven {
    public static boolean checkElevenCondition (int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public static void main(String[] args){
        System.out.println(checkElevenCondition(22));
        System.out.println(checkElevenCondition(23));
        System.out.println(checkElevenCondition(24));
    }
}
