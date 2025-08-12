public class RestaurantDateDecision {
    public static void main(String[] args) {
        System.out.println(getTableChance(5, 10));// → 2
        System.out.println(getTableChance(5, 2));// → 0
        System.out.println(getTableChance(5, 5));// → 1
    }
    public static int getTableChance(int you, int date) {
        if(you <= 2 || date <= 2){
            return 0;
        }
        else if(you >= 8 || date >= 8){
            return 2;
        }
        return 1;
    }
}
