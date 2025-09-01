public class CigarPartyChecker {

    public boolean isSuccessfulCigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60 && !isWeekend) {
            return true;
        } else if (cigars >= 40 && isWeekend) {
            return true;
        }

        return false;
    }

}
