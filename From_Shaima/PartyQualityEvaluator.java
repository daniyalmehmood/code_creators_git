public class PartyQualityEvaluator {
    public static int evaluateTeaCandyParty(int tea, int candy) {
        if (tea<5 || candy<5){
            return 0; // return 0 if tea or candy is less than 5
        }
        if (tea>=2*candy ||candy>=2*tea ){
            return 2; // return 2 if tea is double of candy or more  Or candy is double of tea or more
        }
        return 1; //otherwise return 1
    }
    public static void main(String[] args) {
        System.out.println(evaluateTeaCandyParty(6,8));
    }
}
