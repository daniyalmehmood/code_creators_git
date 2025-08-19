public class TeaParty {
    public static int getPartyQuality(int tea, int candy) {
        if(tea < 5 || candy < 5){
            return 0;
        }
        else if (tea>=2*candy||candy>=2*tea){
            return 2;
        }
  else{
            return 1;
        }
    }
        public static void main (String[] args){
            System.out.println(getPartyQuality(6,8));
            System.out.println(getPartyQuality(3,8));
            System.out.println(getPartyQuality(20,6));
        }

    }
