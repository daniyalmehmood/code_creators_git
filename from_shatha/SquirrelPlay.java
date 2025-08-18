public class SquirrelPlay {
    public static boolean doSquirrelsPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;
        } else {
            return temp >= 60 && temp <= 90;
        }
    }
        public static void main (String[] args){
            System.out.println(doSquirrelsPlay(70, true));
            System.out.println(doSquirrelsPlay(95, false));
            System.out.println(doSquirrelsPlay(95, true));
        }

}
