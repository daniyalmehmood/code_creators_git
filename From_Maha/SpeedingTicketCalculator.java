public class SpeedingTicketCalculator {
     // Calculates the speeding ticket category based on speed and birthday.
     //return 0 = no ticket, 1 = small ticket, 2 = big ticket
    public int calculateTicket(int speed, boolean isBirthday) {
        int extraSpeed = isBirthday ? 5 : 0;
        if (speed <= 60 + extraSpeed) {
            return 0;
        } else if (speed <= 80 + extraSpeed) {
            return 1;
        }
        return 2;
    }
}
