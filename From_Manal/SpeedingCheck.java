public class SpeedingCheck {
    public static int getTicketCategory(int speed, boolean isBirthday) {
        int allowedSpeed = isBirthday ? speed - 5 : speed;
        if (allowedSpeed <= 60) return 0;
        else if (allowedSpeed <= 80) return 1;
        else return 2;
    }
    public static void main(String[] args) {
        System.out.println(getTicketCategory(60, false)); // 0
        System.out.println(getTicketCategory(65, false)); // 1
        System.out.println(getTicketCategory(65, true));  // 0
    }
}