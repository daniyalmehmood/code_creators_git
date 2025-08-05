public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if ((speed<=60)|| (speed<=65 && isBirthday))
            return 0;
        if ((speed>=61 && speed<=80)|| (speed>=66 && speed<=85 && isBirthday))
            return 1;

        return 2;
    }

}
