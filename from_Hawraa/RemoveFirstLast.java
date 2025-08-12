public class RemoveFirstLast {
    public static String removeFirstLast(String str) {
        if (str.length() > 1){
            return str.substring(1, str.length() - 1);
        }
        else {
            return str = "";
        }
    }

    public static void main(String[] args){
        System.out.println(removeFirstLast("Hello"));
        System.out.println(removeFirstLast("abc"));
        System.out.println(removeFirstLast("ab"));
    }
}
