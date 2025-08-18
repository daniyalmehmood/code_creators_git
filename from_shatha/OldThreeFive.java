public class OldThreeFive {
    public static boolean isExclusiveMultipleOf3Or5(int n) {
        return (n % 3 ==0|| n % 5==0) && !(n % 3 ==0&& n % 5==0);
    }


public static void main (String[] args){
    System.out.println(isExclusiveMultipleOf3Or5(3));
    System.out.println(isExclusiveMultipleOf3Or5(10));
    System.out.println(isExclusiveMultipleOf3Or5(15));
}


}
