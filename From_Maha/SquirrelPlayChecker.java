public class SquirrelPlayChecker {
    public boolean canSquirrelsPlay(int temp, boolean isSummer) {
        if (temp >= 60 && temp <= 90 && !isSummer) {
            return true;
        }
        return temp >= 60 && temp <= 100 && isSummer;
    }
}
