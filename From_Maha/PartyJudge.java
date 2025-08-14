public class PartyJudge {
    public int rateParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;  // Bad party
        }
        if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;  // Great party
        }
        return 1;      // Good party
    }
}
