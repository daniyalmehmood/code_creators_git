public class CaughtSpeeding {
    public int checkSpeedingPenalty(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed = speed - 5;
        }
        if (speed >= 81) {
            return 2;
        }
        if (speed >= 61 && speed <= 80) {
            return 1;
        } else {
            return 0;
        }
    }
}

   


