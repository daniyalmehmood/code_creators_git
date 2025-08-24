public class TeaAndCandyPartyEvaluator {
    public static int determineTeaCandyPartyOutcome(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= 5 && candy >= 5) {
            if (tea >= 2 * candy || candy >= 2 * tea) {
                return 2;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(determineTeaCandyPartyOutcome(6, 8));
        System.out.println(determineTeaCandyPartyOutcome(3, 8));
        System.out.println(determineTeaCandyPartyOutcome(20, 6));

    }
}