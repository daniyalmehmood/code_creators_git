public class MultipleOfTenChecker {
    public static boolean multipleOfTenChecker(int num) {
        int reminder = num%10;
        if(reminder<=2||reminder>=8){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(multipleOfTenChecker(12));
        System.out.println(multipleOfTenChecker(17));
        System.out.println(multipleOfTenChecker(19));
    }
}
