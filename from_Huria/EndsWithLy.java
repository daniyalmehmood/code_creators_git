public class EndsWithLy {
    public static boolean endsWithLy(String str) {
        if (str.length() < 2) {
            return false;
        }
        String end = str.substring(str.length() - 2);
        return end.equals("ly");
    }

    public static void main(String[] args) {
        System.out.println(endsWithLy("oddly"));
        System.out.println(endsWithLy("y"));
        System.out.println(endsWithLy("oddy"));
    }
}

