public class SquirrelPartyChecker {
    public static boolean isPartySuccessful(int cigars, boolean isWeekend) {
        if (isWeekend && 40<=cigars){
            return true ;
        }
        return 40<= cigars && cigars<=60  ;
    }
    public static void main(String[] args) {
        System.out.println(isPartySuccessful(30,false));
    }
}
