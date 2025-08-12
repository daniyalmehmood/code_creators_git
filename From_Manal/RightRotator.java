public class RightRotator {
    public static String rightRotateByTwo(String str) {
        return str.substring(str.length()-2) + str.substring(0, str.length()-2);
    }
    public static void main(String[] args) {
        System.out.println(rightRotateByTwo("Hello"));
        System.out.println(rightRotateByTwo("java"));
        System.out.println(rightRotateByTwo("Hi"));
    }

}
