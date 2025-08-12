public class PartyQualityChecker {
    public static void main(String[] args) {
        System.out.println(evaluateParty(6, 8));// → 1
        System.out.println(evaluateParty(3, 8));// → 0
        System.out.println(evaluateParty(20, 6));// → 2
    }
    public static int evaluateParty(int tea, int candy) {
        if (tea < 5 && candy < 5) {
            return 0;//bad
        }
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;//great
        }
        return 1;//good
    }
}

