public boolean CigarPartyChecker {
    public boolean isSuccessfulParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars >= 40) {
                return true;
            } else {
                return false;
            }
        } else {
            return cigars >= 40 && cigars <= 60;
        }

    }
}