public class MiddleTwo {
    public static void main(String[] args){
        System.out.println(middleTwo("string")); // → "ri"
        System.out.println(middleTwo("code")); // → "od"
        System.out.println(middleTwo("Practice")); // → "ct"
    }
    public static String middleTwo(String str) {
        if(str.length() > 2){
            int middleTwoChar = str.length() /2;
            return str.substring(middleTwoChar - 1, middleTwoChar + 1);
        }
        return str;
    }
}
