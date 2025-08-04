public class SquirrelPlay {

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp>100 || temp < 60) return false;
        if ((temp>=60 && temp<=90) || isSummer) return true;
        return false;
    }
}
