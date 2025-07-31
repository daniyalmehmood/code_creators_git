public class TwoChar {
    public static void main(String[] args){
        System.out.println(twoChar("java", 0)); //"ja"
        System.out.println(twoChar("java", 2)); //"va"
        System.out.println(twoChar("java", 3)); //"ja"
    }
    public static String twoChar(String str, int index) {
        if (index < 1 || index >= str.length() - 1) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
}
