public class ParrotTroubleCheck {

    public static boolean isInTrouble(boolean talking, int hour) {
    // we are in trouble only if the parrot is talking
        // or the hours is less than 7, or greater than 20
        if (talking == true && (hour < 7 || hour > 20)){
            return true;} //yes, we are in Trouble 

        return false; } //No Trouble

    public static void main (String[] args)
    {
        System.out.println(isInTrouble(true, 6));
        System.out.println(isInTrouble(true, 7));
        System.out.println(isInTrouble(false, 6));
    }
}