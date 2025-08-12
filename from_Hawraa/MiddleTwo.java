public class MiddleTwo {

    public static String middleTwo(String str) {
            int middle = str.length() / 2;
            return str.substring(middle - 1, middle + 1);
        }

    public static void main(String[] args){
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
    }
}
