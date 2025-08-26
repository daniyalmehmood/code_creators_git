public class RestaurantFashionRules {
    public static int tableChance(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (8 <= you || 8 <= date) {
            return 2;
        }
        return 1;
    }

    public static void main(String[] args) {

        System.out.println(tableChance(5, 10));
        System.out.println(tableChance(5, 2));
        System.out.println(tableChance(5, 5));
        System.out.println(tableChance(10, 2));
        System.out.println(tableChance(2, 9));
        System.out.println(tableChance(9, 9));
    }
}
