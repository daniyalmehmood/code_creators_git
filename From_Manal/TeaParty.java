public class TeaParty {
    public static int partyRating(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        if(tea >= 2*candy || candy >= 2*tea ) return 2;
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(partyRating(6, 8));
        System.out.println(partyRating(3, 8));
        System.out.println(partyRating(20, 6));
    }
    }