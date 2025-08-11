public class MiddleThree {
    public static void main(String[] args){
        System.out.println(middleThree("Candy"));//"and"
        System.out.println(middleThree("and")); //"and"
        System.out.println(middleThree("solving"));//"lvi"
    }
    public static String middleThree(String str) {
        if(str.length() > 3){
            int middleTwoChar = str.length() /2;
            return str.substring(middleTwoChar - 1, middleTwoChar + 2);
        }
        return str;
    }
}
