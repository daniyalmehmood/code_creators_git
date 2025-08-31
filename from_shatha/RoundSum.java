public class RoundSum {
    public static int sumWithRoundedParts(int a, int b, int c) {
        int aRound;
        int bRound;
        int cRound;

        if (a % 10 >= 5) {
            aRound= a + (10 - (a % 10));
        } else {
            aRound= a - (a % 10);
        }

        if (b % 10 >= 5) {
            bRound= b + (10 - (b % 10));
        } else {
            bRound = b - (b % 10);
        }

        if (c % 10 >= 5) {
            cRound = c + (10 - (c % 10));
        } else {
            cRound = c - (c % 10);
        }

        return aRound + bRound + cRound;
    }

    public static void main(String[] args) {
        System.out.println(sumWithRoundedParts(16, 17, 18));
        System.out.println(sumWithRoundedParts(12, 13, 14));
        System.out.println(sumWithRoundedParts(6, 4, 4));
    }

}


