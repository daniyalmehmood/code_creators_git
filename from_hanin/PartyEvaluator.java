public class PartyEvaluator {
    public static int teaParty(int tea, int candy) {
        // If either tea or candy is less than 5, party is bad return 0
        if (tea < 5 || candy < 5) {
            return 0;
        }

        if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        }

        return 1;
    }
}

