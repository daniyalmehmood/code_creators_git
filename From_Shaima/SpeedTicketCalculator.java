public class SpeedTicketCalculator {
    public static int getTicketCategory(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed<=65){
                return 0;
            }
            if (66<=speed &&speed<=85){
                return 1;
            }
            return 2;
        }
        if (speed<=60){
            return 0;
        }
        if (61<=speed &&speed<=81){
            return 1;
        }
        return 2;
    }
    public  static void main(String[] args) {
        System.out.println(getTicketCategory(60,false));
    }
}
