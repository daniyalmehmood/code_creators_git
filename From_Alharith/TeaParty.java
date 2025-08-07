public class TeaParty {

    public int evaluatePartyQuality(int tea, int candy) {
        int dubTea= 2*tea;
        int dubCandy= 2*candy;
        if (tea<5 || candy<5) return 0;
        if (tea>=dubCandy || candy>=dubTea) return 2;
        return 1;

    }

}
