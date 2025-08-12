public class EndsLy {
    public static boolean endsWithLy(String str) {

        return str.endsWith("ly");
    }
    public static void main(String[] args) {
        System.out.println(endsWithLy("oddly"));
        System.out.println(endsWithLy("y"));
        System.out.println(endsWithLy("oddy"));
    }
}