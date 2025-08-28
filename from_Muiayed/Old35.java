public class Old35 {

    public static boolean old35(int n) {
        boolean div3 = n % 3 == 0;
        boolean div5 = n % 5 == 0;
        return (div3 || div5) && !(div3 && div5);
    }

    public static void main(String[] args) {
        System.out.println(old35(3));  // true
        System.out.println(old35(10)); // true
        System.out.println(old35(15)); // false
    }
}