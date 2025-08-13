public class SortaSum {
    public static int sumWithTeenRangeRule(int a, int b) {
        if(a + b >= 10 && a + b <= 19 ){
            return 20;
        }
        return a + b;
    }

    public static void main(String[] args){
        System.out.println(sumWithTeenRangeRule(3, 4));
        System.out.println(sumWithTeenRangeRule(9, 4));
        System.out.println(sumWithTeenRangeRule(10, 11));
    }
}
