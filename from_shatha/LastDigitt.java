public class LastDigitt {
    public static boolean sameLastDigit(int a, int b, int c) {
        int aMod = a % 10;
        int bMod = b % 10;
        int cMod = c % 10;

        return (aMod == bMod) || (bMod == cMod) || (aMod == cMod);
    }   public static void main (String[] args){
        System.out.println(sameLastDigit(23, 19, 13));
        System.out.println(sameLastDigit(23, 19, 12));
        System.out.println(sameLastDigit(5, 5, 7));
    }
}

