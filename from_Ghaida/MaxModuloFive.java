public class MaxModuloFive {
    public static void main(String[] args) {
        System.out.println(checkMaxModuloFive(2, 3));// → 3
        System.out.println(checkMaxModuloFive(6, 2));// → 6
        System.out.println(checkMaxModuloFive(3, 2));// → 3
    }
    public static int checkMaxModuloFive(int a, int b) {
        if(a == b){
            return 0;
        }
        else if(a % 5 == b % 5){
            return (Math.min(a, b));
        }
        return (Math.max(a, b));
    }
}
