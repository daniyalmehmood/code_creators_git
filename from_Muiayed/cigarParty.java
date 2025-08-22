public class cigarParty {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return isWeekend ? cigars >= 40
                : cigars >= 40 && cigars <= 60;
    }

    public static void main(String[] args) {
        System.out.println(cigarParty(30, false)); // false
        System.out.println(cigarParty(50, false)); // true
        System.out.println(cigarParty(70, true));  // true
    }
}
