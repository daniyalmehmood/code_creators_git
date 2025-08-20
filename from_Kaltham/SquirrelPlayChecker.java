//Logic-1 > squirrelPlay

public class SquirrelPlayChecker {
    public boolean canPlay(int temp, boolean isSummer) {
        if (!isSummer && temp >= 60 && temp <= 90) {
            return true;
        }
        if (isSummer && temp >= 60 && temp <= 100) {
            return true;
        }

        return false;
    }
}