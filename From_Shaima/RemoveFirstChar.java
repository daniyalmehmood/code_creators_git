public class RemoveFirstChar {
    public static String removeFirstCharAndConcat(String a, String b) {
        return a.substring(1) + b.substring(1); //remove the first char from 'a' and 'b' and return their concatenation
    }
    public static void main(String[] args) {
        System.out.println(removeFirstCharAndConcat("Hello", "there"));
    }
}
