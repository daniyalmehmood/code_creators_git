public class FirstTwoCharsPicker {
    public static String getFirstTwoCharacter(String str) {
        if(str.length()>= 2){
            return str.substring(0,2);

        }
        else {
            return str;
        }
    }
    public static void main(String[] args) {
        System.out.println(getFirstTwoCharacter("Hello") );
        System.out.println(getFirstTwoCharacter("abcdefg") );
        System.out.println(getFirstTwoCharacter("ab") );
    }

}