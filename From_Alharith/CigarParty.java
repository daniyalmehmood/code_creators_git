public class CigarParty {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars<40) return false;
        if (isWeekend ||(cigars<=60 && cigars>=40)) return true;
        return false;
    }

}
