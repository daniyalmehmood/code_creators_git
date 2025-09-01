public class DrivingSpeed {
    public int itAllowSpeed(int speed, boolean isBirthday) {
        int allowance = 0;

        if (isBirthday) {
            allowance = 5; // you get 5 extra mph on your birthday
        }
        int newSpeed = speed - allowance;

        if (newSpeed <= 60) {
            return 0; // no ticket
        } else if (newSpeed <= 80) {
            return 1; // small ticket
        } else {
            return 2; // big ticket
        }
    }

}
