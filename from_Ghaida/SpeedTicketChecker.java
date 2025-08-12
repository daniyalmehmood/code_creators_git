public class SpeedTicketChecker {
    public static void main(String[] args) {
        System.out.println(getTicketLevel(60, false));// → 0
        System.out.println(getTicketLevel(65, false));// → 1
        System.out.println(getTicketLevel(65, true));// → 0
    }
    public static int getTicketLevel(int speed, boolean isBirthday) {
        if(isBirthday){
            speed -= 5;// decrease speed limit by 5 if it's the driver's birthday
        }
        if(speed <= 60){
            return 0;//no ticket
        }
        else if (speed <= 80) {
            return 1;//small ticket
        }
        return 2;//big ticket
    }
}
