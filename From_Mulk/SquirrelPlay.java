public class SquirrelPlay {
    public boolean checkSquirrelPlayConditions(int temp, boolean isSummer) {
        if (isSummer && temp >= 60 && temp <= 100) {
            return true;
        }
        if (temp >= 60 && temp <= 90) {
            return true;
        } else {
            return false;
        }
    }
}


