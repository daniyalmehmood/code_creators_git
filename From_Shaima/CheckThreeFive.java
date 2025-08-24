public class CheckThreeFive {
    public static boolean isMultipleOf3Or5(int n) {
        if((n>0 && n%3==0 &&n%5!=0 )||(n>0 && n%5==0 && n%3!=0)){ //if n is positive and dividable by 3 and not 5 Or n is positive and dividable by 5 and not 3
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isMultipleOf3Or5(3));
    }
}
