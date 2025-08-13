public class DateFashion {
    public static int getTableValue(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        }
        else if (you >= 8 || date >= 8) {
            return 2;
        }
        return 1;
    }
    public static void main(String[] args){
        System.out.println(getTableValue(5, 10));
        System.out.println(getTableValue(5, 2));
        System.out.println(getTableValue(5, 5));
    }
}
