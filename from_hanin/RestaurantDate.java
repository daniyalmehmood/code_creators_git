public class RestaurantDate {
    public int evaluateDateOutcome(int you, int date) {
        // If either person has  score of 2 or less, =  0
        if (you <= 2 || date <= 2) {
            return 0;
        }
        // If either person has a style score of 8 or more, = 8
        else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }
}

