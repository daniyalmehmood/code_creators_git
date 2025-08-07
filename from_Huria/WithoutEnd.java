public class WithoutEnd {
    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);

    }

    public static void main(String[] args) {

        System.out.println(WithoutEnd.withoutEnd("Hello"));
        System.out.println(WithoutEnd.withoutEnd("java"));
        System.out.println(WithoutEnd.withoutEnd("coding"));
        System.out.println(WithoutEnd.withoutEnd("Chocolate!"));
        System.out.println(WithoutEnd.withoutEnd("ab"));
    }
}