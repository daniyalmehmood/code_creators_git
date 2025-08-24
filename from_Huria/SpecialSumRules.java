public class SpecialSumRules {
    public static int specialSumRules(int a, int b) {
        int sum=a+b ;
        if (10<=sum && sum<=19){
            return 20 ;
        }
        return sum ;
    }
    public static void main(String[] args) {

        System.out.println(specialSumRules(3, 4));
        System.out.println(specialSumRules(9, 4));
        System.out.println(specialSumRules(10, 11));
    }
}
