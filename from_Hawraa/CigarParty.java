public class CigarParty {
    public static boolean isPartySuccessful(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60 || (cigars >= 40 && isWeekend)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPartySuccessful(30, false));
        System.out.println(isPartySuccessful(50, false));
        System.out.println(isPartySuccessful(70, true));
    }
}
