public class Remover {
    public static String removeTheFirstAndLastChar(String str) {
      return str.substring(1,str.length()-1); // return the middle chars from index without first and last chars
    }
    public static void main(String[] args) {
        System.out.println(removeTheFirstAndLastChar("Hello"));
    }
}
