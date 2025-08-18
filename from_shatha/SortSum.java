public class SortSum {
    public static int sumWithRules(int a, int b) {
        if ((a+b)>=10 && (a+b)<=19){
            return 20;
        }
        return (a+b);
    }
    public static void main (String[] args){
        System.out.println(sumWithRules(3,4));
        System.out.println(sumWithRules(9,4));
        System.out.println(sumWithRules(10,11));
    }
}
