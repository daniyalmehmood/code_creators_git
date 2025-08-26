public class DateFashionChecker {
    public static int tableChance(int you, int date) {
        if  (you<=2 || date<=2){
            return 0;}
        else if (8<=you|| 8<=date){
            return 2;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(tableChance(10,5));
    }
}
