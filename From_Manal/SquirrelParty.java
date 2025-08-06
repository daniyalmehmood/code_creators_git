public class SquirrelParty {
    public static boolean isPartySuccessful(int cigars, boolean isWeekend) {
        if (isWeekend) return cigars >= 40;
        return cigars >= 40 && cigars <= 60;
    }
    public static void main(String[] args) {
        System.out.println(isPartySuccessful(30, false)); // false
        System.out.println(isPartySuccessful(50, false)); // true
        System.out.println(isPartySuccessful(70, true));  // true
    }
}